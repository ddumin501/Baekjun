import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class p1260_adv {
	
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int N = sc.nextInt(); // 초기화
	      int M = sc.nextInt();
	      int S = sc.nextInt(); // 시작 정점.
	      Queue<Integer>[] graph = new PriorityQueue[N + 1];
	      Queue<Integer>[] graph1 = new PriorityQueue[N + 1];
	      for (int i = 0; i <= N; i++) {
	         graph[i] = new PriorityQueue<Integer>();
	         graph1[i] = new PriorityQueue<Integer>();
	      }
	      for (int i = 0; i < M; i++) {
	         int ver1 = sc.nextInt();
	         int ver2 = sc.nextInt();

	         graph[ver1].add(ver2);
	         graph[ver2].add(ver1);
	         graph1[ver1].add(ver2);
	         graph1[ver2].add(ver1);
	      }
	      DFS(S,N, graph);
	      BFS(S,N, graph1);
	   }
	 
   static void DFS(int start, int N, Queue<Integer>[] graph) {
      int[] status = new int[N + 1];
      Queue<Integer>[] graph1 = graph;

      for (int i = 0; i < N; i++)
         status[i] = 0;
      status[start] = 1;
      System.out.print(start+" ");
      rDFS(start, N, graph1, status);
      System.out.println();
   }

   static void rDFS(int ver, int N, Queue<Integer>[] graph, int[] status) {
      while (!graph[ver].isEmpty()) {
         int vertex = graph[ver].poll();
         if (status[vertex] == 0) {
            status[vertex] = 1;
            System.out.print(vertex + " ");
            rDFS(vertex, N, graph, status);
         }
      }
   }

   static void BFS(int start, int N, Queue<Integer> []graph ) {
   
      int[] status = new int[N+1];
      Queue<Integer> []graph1 = graph;
      LinkedList<Integer> queue = new LinkedList<Integer>();
      for(int i=0;i<N+1;i++) 
         status[i] = 0;
      
      status[start] = 1; 
      System.out.print(start+" ");
      rBFS(start, N, graph1, status, queue);
      System.out.println(); 
   }

   static void rBFS(int ver, int N, Queue<Integer>[] graph, int[] status, LinkedList<Integer> queue) {

      while(!graph[ver].isEmpty()) {
         int vertex = graph[ver].poll();
         if(status[vertex] == 0) {
            status[vertex] = 1;
            queue.add(vertex);
            System.out.print(vertex+ " ");
         }
      }
      if(!queue.isEmpty())
         rBFS(queue.poll(), N, graph, status, queue);
      
   }

  
}