package GameOfLife;

//Student Name:
//student ID
//Date 


public class GameOfLife
{

    public static void main(String[] args)
    {
        int M = 15, N = 15;

        int[][] grid = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },

        };



        System.out.println("Present Population");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        newPopulation(grid, M, N);
    }


    static void newPopulation(int[][] grid, int M, int N)
    {
        int[][] show = new int[M][N];

        for (int n = 0; n < M; n++)
        {
            for (int m = 0; m < N; m++)
            {
                int newPopulation = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        if ((n+i>=0 && n+i<M) && (m+j>=0 && m+j<N))
                            newPopulation += grid[n + i][m + j];

                newPopulation -= grid[n][m];




                if ((grid[n][m] == 1) && (newPopulation < 2))
                    show[n][m] = 0;

                else if ((grid[n][m] == 1) && (newPopulation > 3))
                    show[n][m] = 0;

                else if ((grid[n][m] == 0) && (newPopulation == 3
                ))
                    show[n][m] = 1;

                else
                    show[n][m] = grid[n][m];
            }
        }


        System.out.println("New Population");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                if (show[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();

        }
    }
}
