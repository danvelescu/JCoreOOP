package collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Comparator<GPU> comparator = null;

        System.out.println("Hello please choose comparable:"+
                        "\n" +"1.By boost"+
                        "\n" +"2.By name"+
                        "\n" +"3.By memmory"+
                        "\n" +"4.By price"
                );
        Scanner sc = new Scanner(System.in);

        int selInput = sc.nextInt();


        List<GPU> gpus1 = new ArrayList<>();
        List<GPU> gpus2 = new ArrayList<>();
        Set<GPU> gpuSet;
        gpus1.add(new GPU("RTX 3090",1000,16,1.1));
        gpus1.add(new GPU("RTX 3090",900,16,1.1));
        gpus1.add(new GPU("RTX 3090",900,16,4.1));
        gpus1.add(new GPU("RTX 3090",900,16,1.1));


        gpus2.add(new GPU("RTX 3090",900,16,4.1));
        gpus2.add(new GPU("RTX 3090",900,16,2.1));
        gpus2.add(new GPU("RTX 3080",900,18,1.1));
        gpus2.add(new GPU("RTX 3080",900,16,3.1));

        System.out.println("List compare unique element by your choose");

        if(selInput==1){
             gpuSet = new TreeSet<>(new CompareByBoost());
            gpuSet.addAll(gpus1);
            gpuSet.addAll(gpus2);
            for (GPU gpu:gpuSet) System.out.println(gpu.toString());
        }else if(selInput == 2)
        {
            gpuSet = new TreeSet<>(new CompareGPUbyName());
            gpuSet.addAll(gpus1);
            gpuSet.addAll(gpus2);
            for (GPU gpu:gpuSet) System.out.println(gpu.toString());
        }
        else if(selInput == 3)
        {
            gpuSet = new TreeSet<>(new CompareGPUbyMemmory());
            gpuSet.addAll(gpus1);
            gpuSet.addAll(gpus2);
            for (GPU gpu:gpuSet) System.out.println(gpu.toString());
        }
        else {
            gpuSet = new TreeSet<>(new CompareGPUbyPrice());
            gpuSet.addAll(gpus1);
            gpuSet.addAll(gpus2);
            for (GPU gpu:gpuSet) System.out.println(gpu.toString());
        }

    }
}
