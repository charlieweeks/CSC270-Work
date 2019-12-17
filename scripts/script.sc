import scala.io.Source

:load utilities.sc

val myLines: Vector[String] = loadFile("text/Count_of_Monte_Cristo.txt")

val oneBigString: String = myLines.mkString(" ")

val myCharacters: Vector[Char] = oneBigString.toVector

val myBetterCharacters: Vector[String] = myCharacters.map( _.toString )

val noSpaces: Vector[String] = myBetterCharacters.filter ( _ != " " )

val groupedCharacters: Vector[ (String, Vector[String] ) ] = {
  noSpaces.groupBy (c => c).toVector
}

val characterHistogramUnsorted: Vector[ (String,Int) ] = {
  groupedCharacters.map( c => {
    ( c._1, c._2.size )
  })
}

val characterHistogram: Vector[ (String, Int) ] = characterHistogramUnsorted.sortBy( _._2 ).reverse

/*
val crazyHistogram: Vector[ ( String, Int ) ] = {
  myLines.mkString.filter( _ != ' ' ).groupBy( c => c).toVector.map( t => (t._1,1._2size ) ).sortBy( _._2).reverse.map( t => ( t._1.toString, t._2) )
}

characterHistogram == crazyHistogram
*/

for ( h <- characterHistogram ) println( s"${h._1}\t${h._2}" )

//then just copy and paste that output (which has tabs) into excel, click the paste icon that pops up, then use the import wizard to get it formatted correctly
