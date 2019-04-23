package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    GridPane root = new GridPane();


    public void start(Stage primaryStage) {

        Scanner in=new Scanner(System.in);
        System.out.println("Automaty komorkowe jednowymiarowe:");
        System.out.print("Podaj metode 30-1, 60-2, 90-3, 120-4, 225-5 :");
        int metoda=in.nextInt();
        System.out.print("Podaj ilosc wierszy:");
        int rozmiarX=in.nextInt();
        System.out.print("Podaj ilosc kolumn:");
        int rozmiarY=in.nextInt();
        int[][] tab=new int[rozmiarX][rozmiarY];

        for(int i=0;i<rozmiarX;i++)
        {
            for(int j=0;j<rozmiarY;j++)
            {
                tab[i][j]=0;
            }
        }

        tab[0][rozmiarY/2]=1;
        if(metoda==1) {
            for (int i = 0; i < rozmiarX; i++) {
                for (int j = 0; j < rozmiarY; j++) {
                    if(j==0)
                    {
                        if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        }
                    }
                    else if(j==rozmiarY-1) {
                        if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 0 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                    else{
                        if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                }
            }
        }
        else if(metoda==2)
        {
            for (int i = 0; i < rozmiarX; i++) {
                for (int j = 0; j < rozmiarY; j++) {
                    if(j==0)
                    {
                        if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        }
                    }
                    else if(j==rozmiarY-1) {
                        if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                    else{
                        if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                }
            }

        }//zrobione do 2
        else if(metoda==3)
        {
            for (int i = 0; i < rozmiarX; i++) {
                for (int j = 0; j < rozmiarY; j++) {
                    if(j==0)
                    {
                        if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        }
                    }
                    else if(j==rozmiarY-1) {
                        if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 0 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                    else{
                        if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                }
            }
        }
        else if(metoda==4)
        {
            for (int i = 0; i < rozmiarX; i++) {
                for (int j = 0; j < rozmiarY; j++) {
                    if(j==0)
                    {
                        if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        }
                    }
                    else if(j==rozmiarY-1) {
                        if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                    else{
                        if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                }
            }
        }
        else if(metoda==5)
        {
            for (int i = 0; i < rozmiarX; i++) {
                for (int j = 0; j < rozmiarY; j++) {
                    if(j==0)
                    {
                        if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        } else if (tab[i][rozmiarY-1] == 0 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i+1][j] = 1;
                        }
                    }
                    else if(j==rozmiarY-1) {
                        if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][0] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 0 && tab[i][0] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                    else{
                        if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 1 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 1 && tab[i][j] == 0 && tab[i][j + 1] == 1 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        } else if (tab[i][j-1] == 0 && tab[i][j] == 0 && tab[i][j + 1] == 0 && i != rozmiarX - 1) {
                            tab[i + 1][j] = 1;
                        }
                    }
                }
            }
        }






        for (int row = 0; row < rozmiarX; row++) {
            for (int col = 0; col < rozmiarY; col++) {
                Rectangle square = new Rectangle();
                Color color;
                if (tab[row][col]==0) color = Color.WHITE;
                else color = Color.BLACK;
                square.setFill(color);
                root.add(square, col, row);
                square.widthProperty().bind(root.widthProperty().divide(rozmiarY));
                square.heightProperty().bind(root.heightProperty().divide(rozmiarX));
            }
        }
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
