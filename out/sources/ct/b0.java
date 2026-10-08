package ct;

import fr.q0;
import ir.ObservableProperty;
import java.lang.reflect.Field;
import java.util.Set;
import pq.e1;
import st.t0;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 implements y {
    static final /* synthetic */ mr.l<Object>[] Z = {q0.f(new fr.b0(b0.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0)), q0.f(new fr.b0(b0.class, "withDefinedIn", "getWithDefinedIn()Z", 0)), q0.f(new fr.b0(b0.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0)), q0.f(new fr.b0(b0.class, "modifiers", "getModifiers()Ljava/util/Set;", 0)), q0.f(new fr.b0(b0.class, "startFromName", "getStartFromName()Z", 0)), q0.f(new fr.b0(b0.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0)), q0.f(new fr.b0(b0.class, "debugMode", "getDebugMode()Z", 0)), q0.f(new fr.b0(b0.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0)), q0.f(new fr.b0(b0.class, "verbose", "getVerbose()Z", 0)), q0.f(new fr.b0(b0.class, "unitReturnType", "getUnitReturnType()Z", 0)), q0.f(new fr.b0(b0.class, "withoutReturnType", "getWithoutReturnType()Z", 0)), q0.f(new fr.b0(b0.class, "enhancedTypes", "getEnhancedTypes()Z", 0)), q0.f(new fr.b0(b0.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0)), q0.f(new fr.b0(b0.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0)), q0.f(new fr.b0(b0.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0)), q0.f(new fr.b0(b0.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0)), q0.f(new fr.b0(b0.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0)), q0.f(new fr.b0(b0.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0)), q0.f(new fr.b0(b0.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0)), q0.f(new fr.b0(b0.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0)), q0.f(new fr.b0(b0.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0)), q0.f(new fr.b0(b0.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0)), q0.f(new fr.b0(b0.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0)), q0.f(new fr.b0(b0.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0)), q0.f(new fr.b0(b0.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0)), q0.f(new fr.b0(b0.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0)), q0.f(new fr.b0(b0.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0)), q0.f(new fr.b0(b0.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0)), q0.f(new fr.b0(b0.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0)), q0.f(new fr.b0(b0.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0)), q0.f(new fr.b0(b0.class, "receiverAfterName", "getReceiverAfterName()Z", 0)), q0.f(new fr.b0(b0.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0)), q0.f(new fr.b0(b0.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0)), q0.f(new fr.b0(b0.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0)), q0.f(new fr.b0(b0.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0)), q0.f(new fr.b0(b0.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0)), q0.f(new fr.b0(b0.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0)), q0.f(new fr.b0(b0.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0)), q0.f(new fr.b0(b0.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0)), q0.f(new fr.b0(b0.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0)), q0.f(new fr.b0(b0.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0)), q0.f(new fr.b0(b0.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0)), q0.f(new fr.b0(b0.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0)), q0.f(new fr.b0(b0.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0)), q0.f(new fr.b0(b0.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0)), q0.f(new fr.b0(b0.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0)), q0.f(new fr.b0(b0.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0)), q0.f(new fr.b0(b0.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0)), q0.f(new fr.b0(b0.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0)), q0.f(new fr.b0(b0.class, "informativeErrorType", "getInformativeErrorType()Z", 0))};
    private final ir.e A;
    private final ir.e B;
    private final ir.e C;
    private final ir.e D;
    private final ir.e E;
    private final ir.e F;
    private final ir.e G;
    private final ir.e H;
    private final ir.e I;
    private final ir.e J;
    private final ir.e K;
    private final ir.e L;
    private final ir.e M;
    private final ir.e N;
    private final ir.e O;
    private final ir.e P;
    private final ir.e Q;
    private final ir.e R;
    private final ir.e S;
    private final ir.e T;
    private final ir.e U;
    private final ir.e V;
    private final ir.e W;
    private final ir.e X;
    private final ir.e Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ir.e f37599b = r0(b.c.f37597a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ir.e f37600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ir.e f37601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ir.e f37602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ir.e f37603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ir.e f37604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ir.e f37605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ir.e f37606i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ir.e f37607j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ir.e f37608k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ir.e f37609l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ir.e f37610m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ir.e f37611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ir.e f37612o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ir.e f37613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ir.e f37614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ir.e f37615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ir.e f37616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ir.e f37617t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ir.e f37618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ir.e f37619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ir.e f37620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ir.e f37621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ir.e f37622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ir.e f37623z;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends ObservableProperty<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f37624b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, b0 b0Var) {
            super(obj);
            this.f37624b = b0Var;
        }

        @Override // ir.ObservableProperty
        protected boolean d(mr.l<?> lVar, T t15, T t16) {
            if (this.f37624b.p0()) {
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
            return true;
        }
    }

    public b0() {
        Boolean bool = Boolean.TRUE;
        this.f37600c = r0(bool);
        this.f37601d = r0(bool);
        this.f37602e = r0(x.f37690c);
        Boolean bool2 = Boolean.FALSE;
        this.f37603f = r0(bool2);
        this.f37604g = r0(bool2);
        this.f37605h = r0(bool2);
        this.f37606i = r0(bool2);
        this.f37607j = r0(bool2);
        this.f37608k = r0(bool);
        this.f37609l = r0(bool2);
        this.f37610m = r0(bool2);
        this.f37611n = r0(bool2);
        this.f37612o = r0(bool);
        this.f37613p = r0(bool);
        this.f37614q = r0(bool2);
        this.f37615r = r0(bool2);
        this.f37616s = r0(bool2);
        this.f37617t = r0(bool2);
        this.f37618u = r0(bool2);
        this.f37619v = r0(null);
        this.f37620w = r0(bool2);
        this.f37621x = r0(bool2);
        this.f37622y = r0(z.f37709a);
        this.f37623z = r0(a0.f37594a);
        this.A = r0(bool);
        this.B = r0(e0.RENDER_OPEN);
        this.C = r0(n.b.a.f37672a);
        this.D = r0(h0.PLAIN);
        this.E = r0(f0.ALL);
        this.F = r0(bool2);
        this.G = r0(bool2);
        this.H = r0(g0.DEBUG);
        this.I = r0(bool2);
        this.J = r0(bool2);
        this.K = r0(e1.e());
        this.L = r0(c0.f37626a.a());
        this.M = r0(null);
        this.N = r0(ct.a.NO_ARGUMENTS);
        this.O = r0(bool2);
        this.P = r0(bool);
        this.Q = r0(bool);
        this.R = r0(bool2);
        this.S = r0(bool2);
        this.T = r0(bool);
        this.U = r0(bool);
        this.V = r0(bool2);
        this.W = r0(bool2);
        this.X = r0(bool2);
        this.Y = r0(bool);
    }

    private final <T> ir.e<b0, T> r0(T t15) {
        ir.a aVar = ir.a.f96711a;
        return new a(t15, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 s0(t0 t0Var) {
        return t0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(t1 t1Var) {
        return "...";
    }

    public er.l<t1, String> A() {
        return (er.l) this.f37623z.a(this, Z[24]);
    }

    public boolean B() {
        return ((Boolean) this.J.a(this, Z[34])).booleanValue();
    }

    public Set<zs.c> C() {
        return (Set) this.K.a(this, Z[35]);
    }

    public boolean D() {
        return ((Boolean) this.T.a(this, Z[44])).booleanValue();
    }

    public /* bridge */ boolean E() {
        return y.a.a(this);
    }

    public /* bridge */ boolean F() {
        return y.a.b(this);
    }

    public boolean G() {
        return ((Boolean) this.f37618u.a(this, Z[19])).booleanValue();
    }

    public boolean H() {
        return ((Boolean) this.Y.a(this, Z[49])).booleanValue();
    }

    public Set<x> I() {
        return (Set) this.f37602e.a(this, Z[3]);
    }

    public boolean J() {
        return ((Boolean) this.f37611n.a(this, Z[12])).booleanValue();
    }

    public e0 K() {
        return (e0) this.B.a(this, Z[26]);
    }

    public f0 L() {
        return (f0) this.E.a(this, Z[29]);
    }

    public boolean M() {
        return ((Boolean) this.U.a(this, Z[45])).booleanValue();
    }

    public boolean N() {
        return ((Boolean) this.W.a(this, Z[47])).booleanValue();
    }

    public g0 O() {
        return (g0) this.H.a(this, Z[32]);
    }

    public er.l<ft.g<?>, String> P() {
        return (er.l) this.f37619v.a(this, Z[20]);
    }

    public boolean Q() {
        return ((Boolean) this.F.a(this, Z[30])).booleanValue();
    }

    public boolean R() {
        return ((Boolean) this.S.a(this, Z[43])).booleanValue();
    }

    public boolean S() {
        return ((Boolean) this.G.a(this, Z[31])).booleanValue();
    }

    public boolean T() {
        return ((Boolean) this.f37614q.a(this, Z[15])).booleanValue();
    }

    public boolean U() {
        return ((Boolean) this.P.a(this, Z[40])).booleanValue();
    }

    public boolean V() {
        return ((Boolean) this.I.a(this, Z[33])).booleanValue();
    }

    public boolean W() {
        return ((Boolean) this.f37613p.a(this, Z[14])).booleanValue();
    }

    public boolean X() {
        return ((Boolean) this.f37612o.a(this, Z[13])).booleanValue();
    }

    public boolean Y() {
        return ((Boolean) this.f37615r.a(this, Z[16])).booleanValue();
    }

    public boolean Z() {
        return ((Boolean) this.R.a(this, Z[42])).booleanValue();
    }

    @Override // ct.y
    public void a(h0 h0Var) {
        this.D.b(this, Z[28], h0Var);
    }

    public boolean a0() {
        return ((Boolean) this.Q.a(this, Z[41])).booleanValue();
    }

    @Override // ct.y
    public void b(boolean z15) {
        this.f37603f.b(this, Z[4], Boolean.valueOf(z15));
    }

    public boolean b0() {
        return ((Boolean) this.A.a(this, Z[25])).booleanValue();
    }

    @Override // ct.y
    public void c(boolean z15) {
        this.f37600c.b(this, Z[1], Boolean.valueOf(z15));
    }

    public boolean c0() {
        return ((Boolean) this.f37604g.a(this, Z[5])).booleanValue();
    }

    @Override // ct.y
    public boolean d() {
        return ((Boolean) this.f37610m.a(this, Z[11])).booleanValue();
    }

    public boolean d0() {
        return ((Boolean) this.f37603f.a(this, Z[4])).booleanValue();
    }

    @Override // ct.y
    public void e(boolean z15) {
        this.f37621x.b(this, Z[22], Boolean.valueOf(z15));
    }

    public h0 e0() {
        return (h0) this.D.a(this, Z[28]);
    }

    @Override // ct.y
    public void f(boolean z15) {
        this.F.b(this, Z[30], Boolean.valueOf(z15));
    }

    public er.l<t0, t0> f0() {
        return (er.l) this.f37622y.a(this, Z[23]);
    }

    @Override // ct.y
    public void g(b bVar) {
        this.f37599b.b(this, Z[0], bVar);
    }

    public boolean g0() {
        return ((Boolean) this.f37617t.a(this, Z[18])).booleanValue();
    }

    @Override // ct.y
    public Set<zs.c> h() {
        return (Set) this.L.a(this, Z[36]);
    }

    public boolean h0() {
        return ((Boolean) this.f37608k.a(this, Z[9])).booleanValue();
    }

    @Override // ct.y
    public boolean i() {
        return ((Boolean) this.f37605h.a(this, Z[6])).booleanValue();
    }

    public n.b i0() {
        return (n.b) this.C.a(this, Z[27]);
    }

    @Override // ct.y
    public ct.a j() {
        return (ct.a) this.N.a(this, Z[38]);
    }

    public boolean j0() {
        return ((Boolean) this.f37607j.a(this, Z[8])).booleanValue();
    }

    @Override // ct.y
    public void k(Set<zs.c> set) {
        this.L.b(this, Z[36], set);
    }

    public boolean k0() {
        return ((Boolean) this.f37600c.a(this, Z[1])).booleanValue();
    }

    @Override // ct.y
    public void l(Set<? extends x> set) {
        this.f37602e.b(this, Z[3], set);
    }

    public boolean l0() {
        return ((Boolean) this.f37601d.a(this, Z[2])).booleanValue();
    }

    @Override // ct.y
    public void m(boolean z15) {
        this.f37605h.b(this, Z[6], Boolean.valueOf(z15));
    }

    public boolean m0() {
        return ((Boolean) this.f37609l.a(this, Z[10])).booleanValue();
    }

    @Override // ct.y
    public void n(boolean z15) {
        this.G.b(this, Z[31], Boolean.valueOf(z15));
    }

    public boolean n0() {
        return ((Boolean) this.f37621x.a(this, Z[22])).booleanValue();
    }

    @Override // ct.y
    public void o(f0 f0Var) {
        this.E.b(this, Z[29], f0Var);
    }

    public boolean o0() {
        return ((Boolean) this.f37620w.a(this, Z[21])).booleanValue();
    }

    @Override // ct.y
    public void p(boolean z15) {
        this.f37620w.b(this, Z[21], Boolean.valueOf(z15));
    }

    public final boolean p0() {
        return this.f37598a;
    }

    public final void q0() {
        this.f37598a = true;
    }

    public final b0 s() {
        b0 b0Var = new b0();
        for (Field field : b0.class.getDeclaredFields()) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    fu.r.V(field.getName(), "is", false, 2, null);
                    mr.c cVarC = q0.c(b0.class);
                    String name = field.getName();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("get");
                    String name2 = field.getName();
                    if (name2.length() > 0) {
                        name2 = Character.toUpperCase(name2.charAt(0)) + name2.substring(1);
                    }
                    sb5.append(name2);
                    field.set(b0Var, b0Var.r0(observableProperty.a(this, new fr.h0(cVarC, name, sb5.toString()))));
                }
            }
        }
        return b0Var;
    }

    public boolean u() {
        return ((Boolean) this.f37616s.a(this, Z[17])).booleanValue();
    }

    public boolean v() {
        return ((Boolean) this.O.a(this, Z[39])).booleanValue();
    }

    public er.l<wr.c, Boolean> w() {
        return (er.l) this.M.a(this, Z[37]);
    }

    public boolean x() {
        return ((Boolean) this.X.a(this, Z[48])).booleanValue();
    }

    public boolean y() {
        return ((Boolean) this.f37606i.a(this, Z[7])).booleanValue();
    }

    public b z() {
        return (b) this.f37599b.a(this, Z[0]);
    }
}
