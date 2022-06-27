package com.snowflake.snowpark_extensions

import com.snowflake.snowpark.Column
import com.snowflake.snowpark.DataFrame
import com.snowflake.snowpark_extensions.implicits.ColumnExtensions
import com.snowflake.snowpark_extensions.implicits.DataFrameExtensions
import com.snowflake.snowpark_extensions.implicits.SessionExtensions
import com.snowflake.snowpark.Session

object Extensions {
  implicit def extendedColumn(c: Column) =
    new ColumnExtensions.ExtendedColumn(c)
  implicit def extendedDataFrame(df: DataFrame) =
    new DataFrameExtensions.ExtendedDataFrame(df)
  implicit def extendedSession(s: Session) =
    new SessionExtensions.ExtendedSession(s)
    def unix_timestamp(
            c:Column,
            format:String
          ) = com.snowflake.snowpark_extensions.helpers.SnowflakeBuiltin.unix_timestamp(c,format)
    def collect_set(c:Column) = com.snowflake.snowpark_extensions.helpers.SnowflakeBuiltin.collect_set(c)
}
