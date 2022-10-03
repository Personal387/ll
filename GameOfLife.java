//Ahmed Abdallah
//student# 7348733
//Date; 10-3-2022 

package GameOfLife;

public class GameOfLife
{

    public static void main(String[] args)
    {
        int A = 15, B = 15;

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
        for (int i = 0; i < A; i++)
        {
            for (int j = 0; j < B; j++)
            {
                if (grid[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        theNewPop(grid, A, B);
    }


    static void theNewPop(int[][] grid, int A, int B)
    {
        int[][] show = new int[A][B];

        for (int b = 0; b < A; b++)
        {
            for (int a = 0; a < B; a++)
            {
                int theNewPop = 0;
                for (int i = -1; i <= 1; i++)
                    for (int j = -1; j <= 1; j++)
                        if ((b+i>=0 && b+i<A) && (a+j>=0 && a+j<B))
                            theNewPop += grid[b + i][a + j];

                theNewPop -= grid[b][a];




                if ((grid[b][a] == 1) && (theNewPop < 2))
                    show[b][a] = 0;

                else if ((grid[b][a] == 1) && (theNewPop > 3))
                    show[b][a] = 0;

                else if ((grid[b][a] == 0) && (theNewPop == 3
                ))
                    show[b][a] = 1;

                else
                    show[b][a] = grid[b][a];
            }
        }


        System.out.println("New Population");
        for (int i = 0; i < A; i++)
        {
            for (int j = 0; j < B; j++)
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
