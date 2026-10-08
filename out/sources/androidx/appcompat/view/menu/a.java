package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f8410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f8411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f8412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f8413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f8414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f8415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f8417h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected k f8418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8419k;

    public a(Context context, int i15, int i16) {
        this.f8410a = context;
        this.f8413d = LayoutInflater.from(context);
        this.f8416g = i15;
        this.f8417h = i16;
    }

    protected void a(View view, int i15) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f8418j).addView(view, i15);
    }

    public abstract void b(g gVar, k.a aVar);

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z15) {
        j.a aVar = this.f8415f;
        if (aVar != null) {
            aVar.c(eVar, z15);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void e(j.a aVar) {
        this.f8415f = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean f(m mVar) {
        j.a aVar = this.f8415f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f8412c;
        }
        return aVar.d(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void g(boolean z15) {
        ViewGroup viewGroup = (ViewGroup) this.f8418j;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f8412c;
        int i15 = 0;
        if (eVar != null) {
            eVar.r();
            ArrayList<g> arrayListE = this.f8412c.E();
            int size = arrayListE.size();
            int i16 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                g gVar = arrayListE.get(i17);
                if (q(i16, gVar)) {
                    View childAt = viewGroup.getChildAt(i16);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewN = n(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewN.setPressed(false);
                        viewN.jumpDrawablesToCurrentState();
                    }
                    if (viewN != childAt) {
                        a(viewN, i16);
                    }
                    i16++;
                }
            }
            i15 = i16;
        }
        while (i15 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i15)) {
                i15++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean i(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void j(Context context, e eVar) {
        this.f8411b = context;
        this.f8414e = LayoutInflater.from(context);
        this.f8412c = eVar;
    }

    public k.a k(ViewGroup viewGroup) {
        return (k.a) this.f8413d.inflate(this.f8417h, viewGroup, false);
    }

    protected boolean l(ViewGroup viewGroup, int i15) {
        viewGroup.removeViewAt(i15);
        return true;
    }

    public j.a m() {
        return this.f8415f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarK = view instanceof k.a ? (k.a) view : k(viewGroup);
        b(gVar, aVarK);
        return (View) aVarK;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f8418j == null) {
            k kVar = (k) this.f8413d.inflate(this.f8416g, viewGroup, false);
            this.f8418j = kVar;
            kVar.a(this.f8412c);
            g(true);
        }
        return this.f8418j;
    }

    public void p(int i15) {
        this.f8419k = i15;
    }

    public abstract boolean q(int i15, g gVar);
}
