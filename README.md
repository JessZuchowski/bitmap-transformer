# bitmap-transformer
seattle-java-401d3 Lab 04: Bitmap part 1

## Authors
Michael Jahns, Nicole Kalbfleisch, Jessica Zuchowski

## Feature Task
Build a bitmap transformer CLI. It will read a bitmap in from disk, run one or more color or raster transforms, then write it out to a new file. 

## To Use:
Execution takes three arguments: target image (.bmp), output directory, transformation type.
Available transformations: invert, degrade, negative, grayscale, deconstruct, swapXXX, shuffleXXX, suite.

This project is designed to run from the command line
  where the first parameter is the path to the .bmp file we are transforming
  the second parameter is the path to output a new .bmp file to
  the third parameter is a string keyword to signify which parameter you'd 
  
    example.
    java app bitMapsAndTransforms/input/file.bmp bitMapsAndTransforms/output/libraHighConstrast deconstruct
    
#### **below is a table showing every transformation keyword and example outputs with the same image 
| Transformation Keyword  | Example .bmp                                                                                                                            |
|-------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|
| none                    | [no transform](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/libra.bmp)                  |
| invert                  | [Inverted Libra](https://github.com/JessZuchowski/bitmap-transformer/blob/master/src/assets/exampleTransforms/invertedLibra)            |
| degrade                 | [Degraded Libra](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/degradedLibra)            |
| negative                | [Negative Libra](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/negativeLibra)            |
| grayscale               | [Grayscale Libra](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/grayLibra)               |
| deconstruct             | [Deconstructed Libra](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/deconstructedLibra)  |
| highConstract           | [High Contrast Libra](https://github.com/JessZuchowski/bitmap-transformer/blob/master/src/assets/exampleTransforms/libraHighConstrast)  |
| swapRBG                 | [Libra RBG](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/LibraRBG)                      |
| swapBGR                 | [Libra BGR](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/LibraBGR)                      |
| swapGRB                 | [Libra GRB](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/LibraGRB)                      |
| shuffleGBR              | [Libra GBR](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/LibraGBR)                      |
| shuffleBRG              | [Libra BRG](https://github.com/JessZuchowski/bitmap-transformer/tree/master/src/assets/exampleTransforms/LibraBRG)                      |
| suite                   | (Suite will run each of the above, and save each to the output folder)                                                                                                      |                                                                                                      | 
