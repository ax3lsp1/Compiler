
make: scanner.Scanner.class parser.CC4Parser.class ast.Ast.class semantic.Semantic.class irt.Irt.class opt.Algebraic.class opt.ConstantFolding.class codegen.Codegen.class Compiler.class

Compiler.class: Compiler.java
	javac Compiler.java

scanner.Scanner.class: scanner/Scanner.java
	javac scanner/Scanner.java

parser.CC4Parser.class: parser/CC4Parser.java
	javac parser/CC4Parser.java

ast.Ast.class: ast/Ast.java
	javac ast/Ast.java

semantic.Semantic.class: semantic/Semantic.java
	javac semantic/Semantic.java

irt.Irt.class: irt/Irt.java
	javac irt/Irt.java

opt.Algebraic.class: opt/Algebraic.java
	javac opt/Algebraic.java

opt.ConstantFolding.class: opt/ConstantFolding.java
	javac opt/ConstantFolding.java

codegen.Codegen.class: codegen/Codegen.java
	javac codegen/Codegen.java

clean:
	del Compiler.class
	del scanner/Scanner.class
	del parser/CC4Parser.class
	del ast/Ast.class
	del semantic/Semantic.class
	del irt/Irt.class
	del opt/Algebraic.class
	del opt/ConstantFolding.class
	del codegen/Codegenerator.class

