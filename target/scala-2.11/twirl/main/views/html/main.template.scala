
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>Reactive Maps</title>

        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>

        <meta name="websocketurl" content=""""),_display_(/*11.45*/routes/*11.51*/.Application.stream("").webSocketURL()),format.raw/*11.89*/(""""/>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*13.105*/(""""/>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("lib/bootstrap/css/bootstrap-theme.css")),format.raw/*14.111*/(""""/>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.at("stylesheets/main.css")),format.raw/*15.94*/(""""/>
        <link rel="stylesheet" href=""""),_display_(/*16.39*/routes/*16.45*/.Assets.at("lib/leaflet/leaflet.css")),format.raw/*16.82*/("""" />

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.59*/routes/*18.65*/.Assets.at("images/favicon.png")),format.raw/*18.97*/("""">

        <script data-main=""""),_display_(/*20.29*/routes/*20.35*/.Assets.at("javascripts/main.js")),format.raw/*20.68*/("""" type="text/javascript" src=""""),_display_(/*20.99*/routes/*20.105*/.Assets.at("lib/requirejs/require.js")),format.raw/*20.143*/(""""></script>
    </head>
    <body>
        """),_display_(/*23.10*/content),format.raw/*23.17*/("""
    """),format.raw/*24.5*/("""</body>
</html>
"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Nov 22 13:57:09 CET 2014
                  SOURCE: C:/Users/Farshad/Desktop/reactive-maps-java/app/views/main.scala.html
                  HASH: 4b214198f154896052e43290c5d56b3a19533499
                  MATRIX: 720->1|823->16|851->18|1113->253|1128->259|1187->297|1272->355|1287->361|1354->406|1438->463|1453->469|1526->520|1610->577|1625->583|1680->617|1749->659|1764->665|1822->702|1913->766|1928->772|1981->804|2040->836|2055->842|2109->875|2167->906|2183->912|2243->950|2314->994|2342->1001|2374->1006
                  LINES: 26->1|29->1|31->3|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|48->20|48->20|48->20|48->20|48->20|48->20|51->23|51->23|52->24
                  -- GENERATED --
              */
          