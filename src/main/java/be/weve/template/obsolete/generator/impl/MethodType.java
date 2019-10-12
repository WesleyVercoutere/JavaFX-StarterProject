package be.weve.template.obsolete.generator.impl;


import be.weve.template.obsolete.generator.Config;
import be.weve.template.obsolete.generator.TypeGenerator;

public class MethodType extends TypeGenerator {
	
	public StringBuilder generateTest(StringBuilder sb, String mName) {
		sb.append("@Test");
		sb.append(Config.NEWLINE);
		sb.append("public void test" + Config.convert(mName) + "() {");
		sb.append(Config.NEWLINE);
		sb.append("\tfail(\"Not yet implemented\");");
		sb.append(Config.NEWLINE);
		sb.append("}");
		sb.append(Config.NEWLINE);
		sb.append(Config.NEWLINE);
		return sb;

	}

}
