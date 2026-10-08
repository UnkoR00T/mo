package id;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m extends a<od.o, Path> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final od.o f90991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f90992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Path f90993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f90994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<hd.s> f90995m;

    public m(List<ud.a<od.o>> list) {
        super(list);
        this.f90991i = new od.o();
        this.f90992j = new Path();
    }

    @Override // id.a
    protected boolean p() {
        List<hd.s> list = this.f90995m;
        return (list == null || list.isEmpty()) ? false : true;
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
    public Path i(ud.a<od.o> aVar, float f15) {
        od.o oVar = aVar.f197576b;
        od.o oVar2 = aVar.f197577c;
        this.f90991i.c(oVar, oVar2 == null ? oVar : oVar2, f15);
        od.o oVarI = this.f90991i;
        List<hd.s> list = this.f90995m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarI = this.f90995m.get(size).i(oVarI);
            }
        }
        td.j.h(oVarI, this.f90992j);
        if (this.f90958e == null) {
            return this.f90992j;
        }
        if (this.f90993k == null) {
            this.f90993k = new Path();
            this.f90994l = new Path();
        }
        td.j.h(oVar, this.f90993k);
        if (oVar2 != null) {
            td.j.h(oVar2, this.f90994l);
        }
        ud.c<A> cVar = this.f90958e;
        float f16 = aVar.f197581g;
        float fFloatValue = aVar.f197582h.floatValue();
        Path path = this.f90993k;
        return (Path) cVar.b(f16, fFloatValue, path, oVar2 == null ? path : this.f90994l, f15, e(), f());
    }

    public void s(List<hd.s> list) {
        this.f90995m = list;
    }
}
