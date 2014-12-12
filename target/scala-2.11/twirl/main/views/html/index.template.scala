
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main/*3.6*/ {_display_(Seq[Any](format.raw/*3.8*/("""

    """),format.raw/*5.5*/("""<div class="container">
        <nav class="navbar navbar-default" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <span class="navbar-brand">Reactive Maps</span>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li data-bind="ifnot: disconnected, click: disconnect"><a href="#">Disconnect</a></li>
                    <li data-bind="ifnot: disconnected, click: toggleMockGps, css: """),format.raw/*19.84*/("""{"""),format.raw/*19.85*/("""active: mockGps() != null"""),format.raw/*19.110*/("""}"""),format.raw/*19.111*/(""""><a href="#">Mock GPS</a></li>
                </ul>
            </div>
        </nav>

        <div data-bind="if: disconnected">
            <form role="form">
                <div class="form-group">
                    <input type="email" class="form-control" data-bind="value: email" placeholder="Email address"/>
                </div>
            </form>
            <button class="btn btn-primary" data-bind="click: submitEmail">Connect</button>
        </div>

        <div data-bind="if: connecting">
            <span data-bind="text: connecting"></span>
        </div>

        <div class="row maps" data-bind="ifnot: disconnected">
            <div data-bind="css: """),format.raw/*38.34*/("""{"""),format.raw/*38.35*/("""'col-md-12': mockGps() == null, 'col-md-8': mockGps() != null"""),format.raw/*38.96*/("""}"""),format.raw/*38.97*/("""" id="map"></div>
            <div class="mockGpsContainer col-md-4">
                <div id="mockGps"></div>
            </div>
        </div>
    </div>
""")))}),format.raw/*44.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Nov 24 21:21:38 CET 2014
                  SOURCE: C:/Users/Farshad/Desktop/reactive-maps-java/app/views/index.scala.html
                  HASH: 263f2281dfaa7e51109cc889c088e4d6f408e9f5
                  MATRIX: 716->1|805->3|833->6|844->10|882->12|914->18|1821->897|1850->898|1904->923|1934->924|2641->1603|2670->1604|2759->1665|2788->1666|2975->1823
                  LINES: 26->1|29->1|31->3|31->3|31->3|33->5|47->19|47->19|47->19|47->19|66->38|66->38|66->38|66->38|72->44
                  -- GENERATED --
              */
          