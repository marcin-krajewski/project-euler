package pl.krajewski.euler.problems.utils.numbers;

import pl.krajewski.euler.problems.utils.classes.MapDoubleKey;

public class TilesUtil {

	private static TilesUtil instance;

	private TilesUtil() {
	}

	public static synchronized TilesUtil getInstance() {
		if (instance == null) {
			instance = new TilesUtil();
		}
		return instance;
	}

	public long getMoves(int tiles, int len) {
		if (tiles < len) {
			return 0L;
		}
		if (tiles == len) {
			return 1L;
		}
		return getMovesWithCacheMap(tiles, len,
				new MapDoubleKey<Integer, Integer, Long>());
	}

	public long getMovesWithCacheMap(int tiles, int len,
			MapDoubleKey<Integer, Integer, Long> cacheMap) {
		Long sum = 0L;
		for (int singleNumber = 0; singleNumber < tiles; singleNumber++) {
			for (int colorNumber = 1; colorNumber <= tiles; colorNumber++) {
				if (tiles == (singleNumber + colorNumber * len)) {
					sum += TilesUtil.getInstance().moves(colorNumber - 1,
							singleNumber, cacheMap);
					if (singleNumber > 0) {
						sum += TilesUtil.getInstance().moves(colorNumber,
								singleNumber - 1, cacheMap);
					}
				}
			}
		}
		return sum;
	}

	private Long moves(int colors, int single,
			MapDoubleKey<Integer, Integer, Long> map) {
		
		if (map.get(colors, single) != null) {
			return map.get(colors, single);
		}
		
		if (colors <= 0 || single <= 0) {
			return 1L;
		}
		
		long moves1 = moves(colors - 1, single, map);
		long moves2 = moves(colors, single - 1, map);
		map.put(colors - 1, single, moves1);
		map.put(colors, single - 1, moves2);
		return moves1 + moves2;
	}
}
