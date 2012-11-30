package pl.krajewski.euler.problems.implementations.problems051_060;

import java.nio.charset.Charset;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.FileReader;

public class Problem059 extends Problem<Long> {

	@Override
	public Long getCorrectProblemAnswer() {
		return 107359L;
	}

	@Override
	public Long resolveProblem() {

		String fileName = getParameterForNumber(0);
		int[] byteCodes = getByteCodes(fileName);

		byte bytea = 'a';
		byte bytez = 'z';

		Long bytesSum = 0L;
		byte[] correctCodes = getCorrectCodes();
		if (correctCodes == null) {
			for (byte code1 = bytea; code1 <= bytez; code1++) {
				for (byte code2 = bytea; code2 <= bytez; code2++) {
					for (byte code3 = bytea; code3 <= bytez; code3++) {
						byte[] messageBytes = new byte[byteCodes.length];
						byte[] keys = new byte[] { code1, code2, code3 };
						for (int index = 0; index < byteCodes.length; index++) {
							messageBytes[index] = (byte) (byteCodes[index] ^ keys[index % 3]);
						}

						String message = new String(messageBytes);
						if (message.toLowerCase().contains("this")) {
							logger.info("SB:\t" + message);
							logger.info("KEYS:");
							logger.info("\tK1:" + keys[0]);
							logger.info("\tK2:" + keys[1]);
							logger.info("\tK3:" + keys[2]);
						}
					}
				}
			}
		} else {
			byte[] bytes = new byte[byteCodes.length];
			for (int index = 0; index < byteCodes.length; index++) {
				bytes[index] = (byte) (byteCodes[index] ^ correctCodes[index % 3]);
				bytesSum += bytes[index];
			}
			String s = new String(bytes, Charset.forName("UTF-8"));
			logger.info("MESSAGE:" + s);
		}

		return bytesSum;
	}

	private byte[] getCorrectCodes() {
		return new byte[] { 103, 111, 100 };
	}

	@Override
	protected Parameters getParametersForProblem() {
		return new Parameters("problem059.txt");
	}

	private int[] getByteCodes(String fileName) {

		String file = FileReader.readProblemFileInOneLine(fileName);

		int index = 0;
		String[] wordsSeparatedWithCommas = FileReader.getWordsSeparatedWithCommas(file);
		int[] lineNumberWithByteCodes = new int[wordsSeparatedWithCommas.length];
		for (String stringByteCode : wordsSeparatedWithCommas) {
			lineNumberWithByteCodes[index++] = Integer.parseInt(stringByteCode);
		}
		return lineNumberWithByteCodes;
	}
}
