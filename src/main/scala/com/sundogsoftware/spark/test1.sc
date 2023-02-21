case class HBaseRecord(col0: String, col1: Boolean,col2: Double, col3: Float,col4: Int, col5: Long, col6: Short, col7: String, col8: Byte)
object HBaseRecord {
  def apply(i: Int, t: String): HBaseRecord = {
    val s = s"""row${"%03d".format(i)}"""
    HBaseRecord(s, i % 2 == 0, i.toDouble, i.toFloat, i, i.toLong, i.toShort, s"String$i: $t", i.toByte)
  }
}

val data = (0 to 255).map({i =>  HBaseRecord(i, "extra")})
sc.parallelize(List(1,2,3)).toDF.write.options(Map(HBaseTableCatalog.tableCatalog -> catalog, HBaseTableCatalog.newTable -> "5")).format("org.apache.spark.sql.execution.datasources.hbase").save()