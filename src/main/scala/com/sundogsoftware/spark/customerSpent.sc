import org.apache.spark._

object CustomerSpent {

  /** Our main function where the action happens */
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext(master = "local[*]", appName = "customerSpent")
    val df = sc.textFile(path = "data/customer-orders.csv")
    print(df.collect())
  }
}