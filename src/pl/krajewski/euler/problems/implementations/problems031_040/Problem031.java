package pl.krajewski.euler.problems.implementations.problems031_040;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import pl.krajewski.euler.problems.Problem;

public class Problem031 extends Problem<Integer> {

	private Integer coinsIndex = 0;
	private Integer maxMoneyIndex = 1;

	@Override
	public Integer resolveProblem() {
		Set<Integer> coins = getParameterForNumber(coinsIndex);
		Integer max = getParameterForNumber(maxMoneyIndex);

		int sum = 0;
		for (int coin200 = 0; coin200 <= max; coin200 += 200) {
			if (coin200 == max) {
				sum++;
				continue;
			}
			for (int coin100 = coin200; coin100 <= max + coin200; coin100 += 100) {
				if (coin100 == max) {
					sum++;
					continue;
				}
				for (int coin50 = coin100; coin50 <= max + coin100; coin50 += 50) {
					if (coin50 == max) {
						sum++;
						continue;
					}
					for (int coin20 = coin50; coin20 <= max + coin50; coin20 += 20) {
						if (coin20 == max) {
							sum++;
							continue;
						}
						for (int coin10 = coin20; coin10 <= max + coin20; coin10 += 10) {
							if (coin10 == max) {
								sum++;
								continue;
							}
							for (int coin5 = coin10; coin5 <= max + coin10; coin5 += 5) {
								if (coin5 == max) {
									sum++;
									continue;
								}
								for (int coin2 = coin5; coin2 <= max + coin5; coin2 += 2) {
									if (coin2 == max) {
										sum++;
										continue;
									}
									for (int coin1 = coin2; coin1 <= max + coin2; coin1 += 1) {
										if (coin1 == max) {
											sum++;
											continue;
										}
									}
								}
							}
						}
					}
				}
			}
		}

		return sum;
//		return getResultOfExampleForUnknownParameters(max, coins);
	}
	
	private int getResultOfExampleForUnknownParameters(int max, Set<Integer> coins) {
		List<Integer> listOfCoins = new ArrayList<Integer>();
		for(Integer coin : coins) {
			listOfCoins.add(coin);
		}
		Collections.sort(listOfCoins);
		Collections.reverse(listOfCoins);
		return getResultOfExampleForUnknownParameters(0, listOfCoins, max, 0);
	}
	
	private int getResultOfExampleForUnknownParameters(int indexOfCurrentCoin, List<Integer> coinsList, int maxSumOfCoins, int previousCoin) {
		try {
			int currentCoin = coinsList.get(indexOfCurrentCoin);
			int sumOfCombinations = 0;
			for (int currentCoinAcceptedValue = previousCoin; currentCoinAcceptedValue <= maxSumOfCoins + previousCoin; currentCoinAcceptedValue += currentCoin) {
				if (currentCoinAcceptedValue == maxSumOfCoins) {
					sumOfCombinations++;
					continue;
				}
				else if(currentCoinAcceptedValue > maxSumOfCoins){
					break;
				}
				sumOfCombinations += getResultOfExampleForUnknownParameters(indexOfCurrentCoin+1, coinsList, maxSumOfCoins, currentCoinAcceptedValue);
			}
			return sumOfCombinations;
		}
		catch(IndexOutOfBoundsException ex) {
			return 0;
		}
		
	}
}
