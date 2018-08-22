package expert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

public class PanCakesBugged {

	public static void main(String[] args) throws Exception {
		PanCakesBugged panCakes = processInput();
		panCakes.sort();
	}

	private Job joblist[];

	private int matrix[][];

	private int numJobs;

	private String sortedArray[];

	public PanCakesBugged(int numberOfJobs) {
		joblist = new Job[numberOfJobs];
		numJobs = 0;
		matrix = new int[numberOfJobs][numberOfJobs];
		for (int i = 0; i < numberOfJobs; i++)
			for (int k = 0; k < numberOfJobs; k++) {
				// matrix 2d array must be initialized
				matrix[i][k] = 0;
			}
		sortedArray = new String[numberOfJobs];
	}

	public void addJobs(String lab) {
		joblist[numJobs++] = new Job(lab);
	}

	public void addOrder(int start, int end) {
		matrix[start][end] = 1;
	}

	public void sort() {
		int orig_nVerts = numJobs;

		while (numJobs > 0) {

			int currentJobs = noSuccessors();
			System.out.println("noSuccessors:"+currentJobs);
			if (currentJobs == -1) {
				System.out.println("ERROR: Graph has cycles");
				return;
			}

			sortedArray[numJobs-1] = joblist[currentJobs].label;

			deleteJobs(currentJobs);
		}

		for (int j = 0; j < orig_nVerts; j++) {
			if (j != 0) {
				System.out.print("->");
			}
			System.out.print(sortedArray[j]);
		}
	}

	public int noSuccessors() {
		boolean isEdge;

		for (int row = 0; row < numJobs; row++) {
			isEdge = false;
			for (int col = 0; col < numJobs; col++) {
				if (matrix[row][col] == 0) {
					isEdge = false;
				} else
					isEdge = true;
				break;
			}
			if (!isEdge)
				return row;
			else
				break;

		}
		return -1;
	}

	public void deleteJobs(int delVert) {
		if (delVert != numJobs - 1) {
			for (int j = delVert; j < numJobs - 1; j++)
				joblist[j] = joblist[j + 1];

			for (int row = delVert; row < numJobs - 1; row++)
				moveRowUp(row, numJobs);

			for (int col = delVert; col < numJobs - 1; col++)
				moveColLeft(col, numJobs - 1);
		}
	}

	private void moveRowUp(int row, int length) {
		for (int col = 0; col < length; col++)
			matrix[row][col] = matrix[row - 1][col];
	}

	private void moveColLeft(int col, int length) {
		for (int row = 0; row < length; row++)
			matrix[row][col] = matrix[row][col - 1];
	}

	public static PanCakesBugged processInput() throws Exception {
		System.out.println("Inside processInput()");
		BufferedReader br = new BufferedReader(new FileReader("D:\\input.txt"));

		int numberOfJobs = Integer.parseInt(br.readLine());
		System.out.println("numberOfJobs=" + numberOfJobs);
		String jobsString = br.readLine();
		System.out.println("jobsString=" + jobsString);
		String jobsStringArr[] = jobsString.split(" ");
		System.out.println("jobsStringArr=" + Arrays.toString(jobsStringArr));

		PanCakesBugged panCakes = new PanCakesBugged(numberOfJobs);

		for (String job : jobsStringArr) {
			System.out.println("Adding job:" + job);
			panCakes.addJobs(job);
		}

		int n = Integer.parseInt(br.readLine());
		System.out.println("n=" + n);
		String str[];
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			System.out.println("str=" + Arrays.toString(str));
			System.out.println("Adding Order:" + str[0] + ", " + str[1]);
			panCakes.addOrder(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}

		return panCakes;
	}

	private class Job {
		public String label;

		public Job(String lab) {
			label = lab;
		}
	}
}