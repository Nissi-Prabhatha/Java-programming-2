import java.util.*;
class Edge
{
int source, dest;
public Edge(int source, int dest) {
		this.source = source;
		this.dest = dest;
	}
}
class Graph
{
	List<List<Integer>> adjList = null;
	Graph(List<Edge> edges, int N)
	{
		adjList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			adjList.add(new ArrayList<>());
		}
		for (Edge edge: edges)
		{
			int src = edge.source;
			int dest = edge.dest;

			adjList.get(src).add(dest);
			adjList.get(dest).add(src);
		}}}

class EdgeQ23
{
	public static boolean DFS(Graph graph, int v, boolean[] discovered, int parent)
	{
		discovered[v] = true;
		for (int w : graph.adjList.get(v))
		{
			if (!discovered[w]) {
				if (!DFS(graph, w, discovered, v))
					return false;
			}
			else if (w != parent) {
				
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		List<Edge> edges = Arrays.asList(
				new Edge(0, 1), new Edge(1, 2), new Edge(2, 3),
				new Edge(3, 4), new Edge(4, 5), new Edge(5, 0)
				// edge (5->0) introduces a cycle in the graph
		);
		final int N = 6;
		Graph graph = new Graph(edges, N);
		boolean[] discovered = new boolean[N];
		boolean isTree = DFS(graph, 0, discovered, -1);

		for (int i = 0; isTree && i < N; i++) {
			if (!discovered[i]) {
				isTree = false;
			}}
		if (isTree) {
			System.out.println("Graph is a Tree");
		}
		else {
			System.out.println("Graph is not a Tree");
		}
	}
}