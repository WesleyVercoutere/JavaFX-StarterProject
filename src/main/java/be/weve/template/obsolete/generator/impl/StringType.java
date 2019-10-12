package be.weve.template.obsolete.generator.impl;

import be.weve.template.obsolete.generator.Config;
import be.weve.template.obsolete.generator.TypeGenerator;

public class StringType extends TypeGenerator {
	
	public StringBuilder generateTest(StringBuilder sb, String attName) {
		sb.append("@Test");
		sb.append(Config.NEWLINE);
		sb.append("public void test" + Config.convert(attName) + "() {");
		sb.append(Config.NEWLINE);
		sb.append("\tclassUnderTest.set" + Config.convert(attName) + "(\"" + "test " + attName + "\");");
		sb.append(Config.NEWLINE);
		sb.append("\tassertEquals(\"test " + attName + "\", " + "classUnderTest.get" + Config.convert(attName) + "());");
		sb.append(Config.NEWLINE);
		sb.append("\tclassUnderTest.set" + Config.convert(attName) + "(\"" + "test2 " + attName + "\");");
		sb.append(Config.NEWLINE);
		sb.append("\tassertEquals(\"test2 " + attName + "\", " + "classUnderTest.get" + Config.convert(attName) + "());");
		sb.append(Config.NEWLINE);
		sb.append("}");
		sb.append(Config.NEWLINE);
		sb.append(Config.NEWLINE);
		return sb;

	}

}
