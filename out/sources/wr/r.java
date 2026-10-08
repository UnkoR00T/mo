package wr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oq.y;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
public enum r {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<r> f214565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<r> f214566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List<r> f214567g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final List<r> f214568h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<r> f214570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final List<r> f214571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<r> f214572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List<r> f214573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final List<r> f214574n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List<r> f214575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final List<r> f214576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final List<r> f214578r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final List<r> f214580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List<r> f214582t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Map<e, r> f214585v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f214595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f214596b;
    private static final /* synthetic */ wq.a L0 = wq.b.a(b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f214563c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, r> f214564d = new HashMap<>();

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    static {
        for (r rVar : e()) {
            f214564d.put(rVar.name(), rVar);
        }
        wq.a<r> aVarE = e();
        ArrayList arrayList = new ArrayList();
        for (r rVar2 : aVarE) {
            if (rVar2.f214596b) {
                arrayList.add(rVar2);
            }
        }
        f214565e = v.k1(arrayList);
        f214566f = v.k1(e());
        r rVar3 = ANNOTATION_CLASS;
        r rVar4 = CLASS;
        f214567g = v.q(rVar3, rVar4);
        f214568h = v.q(LOCAL_CLASS, rVar4);
        f214570j = v.q(CLASS_ONLY, rVar4);
        r rVar5 = COMPANION_OBJECT;
        r rVar6 = OBJECT;
        f214571k = v.q(rVar5, rVar6, rVar4);
        f214572l = v.q(STANDALONE_OBJECT, rVar6, rVar4);
        f214573m = v.q(INTERFACE, rVar4);
        f214574n = v.q(ENUM_CLASS, rVar4);
        r rVar7 = ENUM_ENTRY;
        r rVar8 = PROPERTY;
        r rVar9 = FIELD;
        f214575p = v.q(rVar7, rVar8, rVar9);
        r rVar10 = PROPERTY_SETTER;
        f214576q = v.e(rVar10);
        r rVar11 = PROPERTY_GETTER;
        f214578r = v.e(rVar11);
        f214580s = v.e(FUNCTION);
        r rVar12 = FILE;
        f214582t = v.e(rVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        r rVar13 = VALUE_PARAMETER;
        f214585v = v0.l(y.a(eVar, rVar13), y.a(e.FIELD, rVar9), y.a(e.PROPERTY, rVar8), y.a(e.FILE, rVar12), y.a(e.PROPERTY_GETTER, rVar11), y.a(e.PROPERTY_SETTER, rVar10), y.a(e.RECEIVER, rVar13), y.a(e.SETTER_PARAMETER, rVar13), y.a(e.PROPERTY_DELEGATE_FIELD, rVar9));
    }

    r(String str, boolean z15) {
        this.f214595a = str;
        this.f214596b = z15;
    }

    public static wq.a<r> e() {
        return L0;
    }

    /* synthetic */ r(String str, boolean z15, int i15, fr.k kVar) {
        this(str, (i15 & 2) != 0 ? true : z15);
    }
}
