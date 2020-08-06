// empty map

def mapvar=[:]

println mapvar.size()
// Different ways to put contents of a map

//1
mapvar.put('colour', 'red')

println mapvar
//2
mapvar['lisa']='Jomy'

println mapvar
//3 property method --we add a value to a field in similar way
mapvar.jocelin='jomy'
println mapvar
//4
mapvar<<['joyal':'Jomy']
println mapvar


// retreive data from map
//1
println mapvar['colour']
//2  property type
println mapvar.lisa
//3
println mapvar.get('jocelin')