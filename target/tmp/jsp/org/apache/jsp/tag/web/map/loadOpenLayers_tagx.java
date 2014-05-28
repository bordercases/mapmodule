package org.apache.jsp.tag.web.map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loadOpenLayers_tagx
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();

    try {
      out.write("<link type=\"text/css\" href=\"http://openlayers.org/dev/theme/default/style.css\" rel=\"stylesheet\">");
      out.write("</link>");
      out.write("<link type=\"text/css\" href=\"http://openlayers.org/dev/examples/style.css\" rel=\"stylesheet\">");
      out.write("</link>");
      out.write("<script src=\"http://openlayers.org/api/OpenLayers.js\">");
      out.write("</script>");
      out.write("<script type=\"text/javascript\" language=\"JavaScript\">");
      out.write("\n");
      out.write("\t\n");
      out.write("\t    function init(){\n");
      out.write("\t    \t\n");
      out.write("\t        var map, layer;\n");
      out.write("\t        \n");
      out.write("\t        OpenLayers.ProxyHost=\"/proxy/?url=\";\n");
      out.write("\t        // create new map object\n");
      out.write("\t             var map = new OpenLayers.Map({\n");
      out.write("\t                                          div: \"map\",\n");
      out.write("\t                                          theme: null,\n");
      out.write("\t                                          center: new OpenLayers.LonLat(0, 0),\n");
      out.write("\t                                          zoom: 1\n");
      out.write("\t                                      });\n");
      out.write("\t        \n");
      out.write("\t        // implement WMS service\n");
      out.write("\t        //layer = new OpenLayers.Layer.WMS( \"OpenLayers WMS\", \n");
      out.write("\t        //    \"http://vmap0.tiles.osgeo.org/wms/vmap0\", {layers: 'basic'} ); //set WMS service address here\n");
      out.write("\t        \n");
      out.write("\t        layer = new OpenLayers.Layer.OSM(\"OpenStreetMap\")\n");
      out.write("\t        \n");
      out.write("\t        // attach layer to map\n");
      out.write("\t        map.addLayer(layer);\n");
      out.write("\t        map.setCenter(new OpenLayers.LonLat(0, 0), 0);\n");
      out.write("\t        \n");
      out.write("\t        // LAYER DOCUMENTATION - method types\n");
      out.write("\t        // http://dev.openlayers.org/docs/files/OpenLayers/Layer/WMS-js.html\n");
      out.write("\t        \n");
      out.write("\t        // add \"text\" object\n");
      out.write("\t        // point to tab delimited table giving marker type, marker lat/long, text display\n");
      out.write("\t        var newl = new OpenLayers.Layer.Text( \"Sample Sites\", { location:\"./sample_map_data.csv\"} );\n");
      out.write("\t\n");
      out.write("\t        map.addLayer(newl);\n");
      out.write("\t        \n");
      out.write("\t        //var markers = new OpenLayers.Layer.Markers( \"Markers\" );\n");
      out.write("\t        //map.addLayer(markers);\n");
      out.write("\t\n");
      out.write("\t        var size = new OpenLayers.Size(21,25);\n");
      out.write("\t        var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);\n");
      out.write("\t        //var icon = new OpenLayers.Icon('http://www.openlayers.org/dev/img/marker.png',size,offset);\n");
      out.write("\t        //markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(0,0),icon));\n");
      out.write("\t\n");
      out.write("\t        //var halfIcon = icon.clone();\n");
      out.write("\t        //markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(0,45),halfIcon));\n");
      out.write("\t        //halfIcon.setOpacity(0.5);\n");
      out.write("\t        \n");
      out.write("\t        //marker = new OpenLayers.Marker(new OpenLayers.LonLat(90,10),icon.clone());\n");
      out.write("\t        //marker.setOpacity(0.2);\n");
      out.write("\t        //marker.events.register('mousedown', marker, function(evt) { alert(this.icon.url); OpenLayers.Event.stop(evt); });\n");
      out.write("\t        //markers.addMarker(marker); \n");
      out.write("\t        \n");
      out.write("\t        map.addControl(new OpenLayers.Control.LayerSwitcher());\n");
      out.write("\t        map.zoomToMaxExtent();\n");
      out.write("\t\n");
      out.write("\t        \n");
      out.write("\t    }\n");
      out.write("\t\t\n");
      out.write("\t\t// Event listener catches when the DOM content is fully loaded; then launches the map script\n");
      out.write("\t\tdocument.addEventListener(\"DOMContentLoaded\", function()\n");
      out.write("\t\t{\n");
      out.write("\t\t\tinit();\n");
      out.write("\t\t}, false);\n");
      out.write("\t\t\n");
      out.write("\t");
      out.write("</script>");
      out.write("<div class=\"smallmap\" id=\"map\" style=\"width:500px; height:400px\">");
      out.write("</div>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
