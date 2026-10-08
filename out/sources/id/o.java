package id;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o extends g<md.b> {

    class a extends ud.c<md.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ud.b f91002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ud.c f91003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ md.b f91004f;

        a(ud.b bVar, ud.c cVar, md.b bVar2) {
            this.f91002d = bVar;
            this.f91003e = cVar;
            this.f91004f = bVar2;
        }

        @Override // ud.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public md.b a(ud.b<md.b> bVar) {
            this.f91002d.h(bVar.f(), bVar.a(), bVar.g().f125610a, bVar.b().f125610a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f91003e.a(this.f91002d);
            md.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f91004f.a(str, bVarB.f125611b, bVarB.f125612c, bVarB.f125613d, bVarB.f125614e, bVarB.f125615f, bVarB.f125616g, bVarB.f125617h, bVarB.f125618i, bVarB.f125619j, bVarB.f125620k, bVarB.f125621l, bVarB.f125622m);
            return this.f91004f;
        }
    }

    public o(List<ud.a<md.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
    public md.b i(ud.a<md.b> aVar, float f15) {
        md.b bVar;
        ud.c<A> cVar = this.f90958e;
        if (cVar == 0) {
            return (f15 != 1.0f || (bVar = aVar.f197577c) == null) ? aVar.f197576b : bVar;
        }
        float f16 = aVar.f197581g;
        Float f17 = aVar.f197582h;
        float fFloatValue = f17 == null ? Float.MAX_VALUE : f17.floatValue();
        md.b bVar2 = aVar.f197576b;
        md.b bVar3 = bVar2;
        md.b bVar4 = aVar.f197577c;
        return (md.b) cVar.b(f16, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f15, d(), f());
    }

    public void s(ud.c<String> cVar) {
        super.o(new a(new ud.b(), cVar, new md.b()));
    }
}
