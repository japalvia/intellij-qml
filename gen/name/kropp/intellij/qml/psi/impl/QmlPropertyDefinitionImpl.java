// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static name.kropp.intellij.qml.psi.QmlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import name.kropp.intellij.qml.psi.*;

public class QmlPropertyDefinitionImpl extends ASTWrapperPsiElement implements QmlPropertyDefinition {

  public QmlPropertyDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitPropertyDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public QmlList getList() {
    return findChildByClass(QmlList.class);
  }

  @Override
  @Nullable
  public QmlMethodBody getMethodBody() {
    return findChildByClass(QmlMethodBody.class);
  }

  @Override
  @Nullable
  public QmlMethodCall getMethodCall() {
    return findChildByClass(QmlMethodCall.class);
  }

  @Override
  @Nullable
  public QmlObject getObject() {
    return findChildByClass(QmlObject.class);
  }

  @Override
  @NotNull
  public QmlProperty getProperty() {
    return findNotNullChildByClass(QmlProperty.class);
  }

  @Override
  @Nullable
  public QmlType getType() {
    return findChildByClass(QmlType.class);
  }

}
