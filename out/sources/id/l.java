package id;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g<ud.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ud.d f90990i;

    public l(List<ud.a<ud.d>> list) {
        super(list);
        this.f90990i = new ud.d();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // id.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public ud.d i(ud.a<ud.d> aVar, float f15) {
        ud.d dVar;
        float f16;
        ud.d dVar2 = aVar.f197576b;
        if (dVar2 == null || (dVar = aVar.f197577c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        ud.d dVar3 = dVar2;
        ud.d dVar4 = dVar;
        ud.c<A> cVar = this.f90958e;
        if (cVar != 0) {
            f16 = f15;
            ud.d dVar5 = (ud.d) cVar.b(aVar.f197581g, aVar.f197582h.floatValue(), dVar3, dVar4, f16, e(), f());
            if (dVar5 != null) {
                return dVar5;
            }
        } else {
            f16 = f15;
        }
        this.f90990i.d(td.j.i(dVar3.b(), dVar4.b(), f16), td.j.i(dVar3.c(), dVar4.c(), f16));
        return this.f90990i;
    }
}
