def dimensionfind(t, tc):
    results = []
    for test in tc:
        k = test
        a = test
        n, m = -1, -1
        
        for pn in range(1, k + 1):
            if k % pn == 0:
                pm = k // pn
                if pn in a and pm in a:
                    n, m = pn, pm
                    break
        
        results.append((n, m))
    return results


# Reading input
t = int(input())
tc = [] 

for _ in range(t):
    k = int(input())
    a = list(map(int, input().split()))
    tc.append((k, a))

# Processing and printing results
results = dimensionfind(t, tc)
for n, m in results:
    print(n, m)
