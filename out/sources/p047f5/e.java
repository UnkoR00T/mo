package p047f5;

import c5.h;
import fr.b0;
import fr.k;
import fr.q0;
import ir.ObservableProperty;
import j5.f;
import mr.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\bG\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001f%!B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JR\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JR\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0003\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0003\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b!\u0010 R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010,\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u00104\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0017\u0010\u0015\u001a\u0002058\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b9\u00101R\u0017\u0010;\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b:\u00101R\u0017\u0010\u0016\u001a\u0002058\u0006¢\u0006\f\n\u0004\b0\u00106\u001a\u0004\b2\u00108R\u0017\u0010@\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b7\u0010=\u001a\u0004\b>\u0010?R+\u0010H\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010K\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010C\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR+\u0010S\u001a\u00020L2\u0006\u0010B\u001a\u00020L8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010[\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR+\u0010_\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\\\u001a\u0004\b]\u0010X\"\u0004\b^\u0010ZR+\u0010b\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bQ\u0010\\\u001a\u0004\b`\u0010X\"\u0004\ba\u0010ZR+\u0010e\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\\\u001a\u0004\bc\u0010X\"\u0004\bd\u0010ZR+\u0010i\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010X\"\u0004\bh\u0010ZR+\u0010m\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010\\\u001a\u0004\bk\u0010X\"\u0004\bl\u0010ZR1\u0010r\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010X\"\u0004\bq\u0010ZR1\u0010v\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bs\u0010o\u001a\u0004\bt\u0010X\"\u0004\bu\u0010ZR1\u0010z\u001a\u00020\n2\u0006\u0010B\u001a\u00020\n8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bw\u0010o\u001a\u0004\bx\u0010X\"\u0004\by\u0010ZR+\u0010~\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010\\\u001a\u0004\b|\u0010X\"\u0004\b}\u0010ZR.\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0014\n\u0004\b\u007f\u0010\\\u001a\u0005\b\u0080\u0001\u0010X\"\u0005\b\u0081\u0001\u0010ZR/\u0010\u0086\u0001\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010\\\u001a\u0005\b\u0084\u0001\u0010X\"\u0005\b\u0085\u0001\u0010ZR/\u0010\u008a\u0001\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010\\\u001a\u0005\b\u0088\u0001\u0010X\"\u0005\b\u0089\u0001\u0010ZR.\u0010\u008e\u0001\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u008b\u0001\u0010V\u001a\u0005\b\u008c\u0001\u0010X\"\u0005\b\u008d\u0001\u0010ZR.\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000f8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010V\u001a\u0005\b\u0090\u0001\u0010X\"\u0005\b\u0091\u0001\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0093\u0001"}, d2 = {"Lf5/e;", "", "id", "Lj5/f;", "containerObject", "<init>", "(Ljava/lang/Object;Lj5/f;)V", "Lf5/i$c;", "start", "end", "Lc5/h;", "startMargin", "endMargin", "startGoneMargin", "endGoneMargin", "", "bias", "Loq/i0;", "l", "(Lf5/i$c;Lf5/i$c;FFFFF)V", "Lf5/i$b;", "top", "bottom", "topMargin", "bottomMargin", "topGoneMargin", "bottomGoneMargin", "k", "(Lf5/i$b;Lf5/i$b;FFFFF)V", "Lf5/f;", "other", "a", "(Lf5/f;F)V", "c", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "b", "Lj5/f;", "f", "()Lj5/f;", "Lf5/f;", "h", "()Lf5/f;", "parent", "Lf5/f0;", "d", "Lf5/f0;", "i", "()Lf5/f0;", "e", "getAbsoluteLeft", "absoluteLeft", "Lf5/w;", "Lf5/w;", "j", "()Lf5/w;", "g", "getAbsoluteRight", "absoluteRight", "Lf5/d;", "Lf5/d;", "getBaseline", "()Lf5/d;", "baseline", "Lf5/t;", "<set-?>", "Lf5/e$a;", "getWidth", "()Lf5/t;", "q", "(Lf5/t;)V", "width", "getHeight", "o", "height", "Lf5/g0;", "m", "Lf5/e$d;", "getVisibility", "()Lf5/g0;", "p", "(Lf5/g0;)V", "visibility", "value", "n", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "Lf5/e$c;", "getScaleX", "setScaleX", "scaleX", "getScaleY", "setScaleY", "scaleY", "getRotationX", "setRotationX", "rotationX", "r", "getRotationY", "setRotationY", "rotationY", "s", "getRotationZ", "setRotationZ", "rotationZ", "t", "Lf5/e$b;", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "u", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "v", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "w", "getPivotX", "setPivotX", "pivotX", "x", "getPivotY", "setPivotY", "pivotY", "y", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "z", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "A", "getHorizontalBias", "setHorizontalBias", "horizontalBias", "B", "getVerticalBias", "setVerticalBias", "verticalBias", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e {
    static final /* synthetic */ l<Object>[] C = {q0.f(new b0(e.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), q0.f(new b0(e.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), q0.f(new b0(e.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), q0.f(new b0(e.class, "scaleX", "getScaleX()F", 0)), q0.f(new b0(e.class, "scaleY", "getScaleY()F", 0)), q0.f(new b0(e.class, "rotationX", "getRotationX()F", 0)), q0.f(new b0(e.class, "rotationY", "getRotationY()F", 0)), q0.f(new b0(e.class, "rotationZ", "getRotationZ()F", 0)), q0.f(new b0(e.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), q0.f(new b0(e.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), q0.f(new b0(e.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), q0.f(new b0(e.class, "pivotX", "getPivotX()F", 0)), q0.f(new b0(e.class, "pivotY", "getPivotY()F", 0)), q0.f(new b0(e.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), q0.f(new b0(e.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float horizontalBias;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float verticalBias;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f containerObject;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f parent = new f("parent");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f0 start;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 absoluteLeft;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w top;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f0 end;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final f0 absoluteRight;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final w bottom;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p047f5.d baseline;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a width;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a height;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final d visibility;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final c scaleX;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final c scaleY;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final c rotationX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final c rotationY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final c rotationZ;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final b translationX;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final b translationY;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b translationZ;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final c pivotX;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final c pivotY;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final c horizontalChainWeight;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final c verticalChainWeight;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lf5/e$a;", "Lir/c;", "Lf5/t;", "initialValue", "<init>", "(Lf5/e;Lf5/t;)V", "Lmr/l;", "property", "oldValue", "newValue", "Loq/i0;", "e", "(Lmr/l;Lf5/t;Lf5/t;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class a extends ObservableProperty<t> {
        public a(t tVar) {
            super(tVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ir.ObservableProperty
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(l<?> property, t oldValue, t newValue) {
            e.this.getContainerObject().j0(property.getName(), ((u) newValue).a());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lf5/e$b;", "Lir/c;", "Lc5/h;", "initialValue", "", "nameOverride", "<init>", "(Lf5/e;FLjava/lang/String;Lfr/k;)V", "Lmr/l;", "property", "oldValue", "newValue", "Loq/i0;", "e", "(Lmr/l;FF)V", "b", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends ObservableProperty<h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String nameOverride;

        public /* synthetic */ b(e eVar, float f15, String str, k kVar) {
            this(f15, str);
        }

        @Override // ir.ObservableProperty
        public /* bridge */ /* synthetic */ void c(l lVar, h hVar, h hVar2) {
            e(lVar, hVar.getValue(), hVar2.getValue());
        }

        protected void e(l<?> property, float oldValue, float newValue) {
            if (Float.isNaN(newValue)) {
                return;
            }
            f containerObject = e.this.getContainerObject();
            String name = this.nameOverride;
            if (name == null) {
                name = property.getName();
            }
            containerObject.k0(name, newValue);
        }

        private b(float f15, String str) {
            super(h.j(f15));
            this.nameOverride = str;
        }

        public /* synthetic */ b(e eVar, float f15, String str, int i15, k kVar) {
            this(eVar, f15, (i15 & 2) != 0 ? null : str, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"f5/e$d", "Lir/c;", "Lf5/g0;", "Lmr/l;", "property", "oldValue", "newValue", "Loq/i0;", "e", "(Lmr/l;Lf5/g0;Lf5/g0;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends ObservableProperty<g0> {
        d(g0 g0Var) {
            super(g0Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ir.ObservableProperty
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(l<?> property, g0 oldValue, g0 newValue) {
            e.this.getContainerObject().l0(property.getName(), newValue.getName());
        }
    }

    public e(Object obj, f fVar) {
        this.id = obj;
        this.containerObject = fVar;
        this.start = new r(-2, fVar);
        this.absoluteLeft = new r(0, fVar);
        this.top = new h(0, fVar);
        this.end = new r(-1, fVar);
        this.absoluteRight = new r(1, fVar);
        this.bottom = new h(1, fVar);
        this.baseline = new g(fVar);
        t.Companion companion = t.INSTANCE;
        this.width = new a(companion.c());
        this.height = new a(companion.c());
        this.visibility = new d(g0.INSTANCE.b());
        this.alpha = 1.0f;
        this.scaleX = new c(this, 1.0f, null, 2, null);
        int i15 = 2;
        k kVar = null;
        String str = null;
        this.scaleY = new c(this, 1.0f, str, i15, kVar);
        float f15 = 0.0f;
        this.rotationX = new c(this, f15, str, i15, kVar);
        this.rotationY = new c(this, f15, str, i15, kVar);
        this.rotationZ = new c(this, f15, str, i15, kVar);
        float f16 = 0;
        this.translationX = new b(this, h.n(f16), str, i15, kVar);
        this.translationY = new b(this, h.n(f16), str, i15, kVar);
        this.translationZ = new b(this, h.n(f16), str, i15, kVar);
        float f17 = 0.5f;
        this.pivotX = new c(this, f17, str, i15, kVar);
        this.pivotY = new c(this, f17, str, i15, kVar);
        this.horizontalChainWeight = new c(Float.NaN, "hWeight");
        this.verticalChainWeight = new c(Float.NaN, "vWeight");
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
    }

    public static /* synthetic */ void b(e eVar, f fVar, float f15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f15 = 0.5f;
        }
        eVar.a(fVar, f15);
    }

    public static /* synthetic */ void d(e eVar, f fVar, float f15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            f15 = 0.5f;
        }
        eVar.c(fVar, f15);
    }

    public static /* synthetic */ void m(e eVar, i.HorizontalAnchor horizontalAnchor, i.HorizontalAnchor horizontalAnchor2, float f15, float f16, float f17, float f18, float f19, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            f15 = h.n(0);
        }
        float f25 = f15;
        if ((i15 & 8) != 0) {
            f16 = h.n(0);
        }
        float f26 = f16;
        if ((i15 & 16) != 0) {
            f17 = h.n(0);
        }
        eVar.k(horizontalAnchor, horizontalAnchor2, f25, f26, f17, (i15 & 32) != 0 ? h.n(0) : f18, (i15 & 64) != 0 ? 0.5f : f19);
    }

    public static /* synthetic */ void n(e eVar, i.VerticalAnchor verticalAnchor, i.VerticalAnchor verticalAnchor2, float f15, float f16, float f17, float f18, float f19, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            f15 = h.n(0);
        }
        float f25 = f15;
        if ((i15 & 8) != 0) {
            f16 = h.n(0);
        }
        float f26 = f16;
        if ((i15 & 16) != 0) {
            f17 = h.n(0);
        }
        eVar.l(verticalAnchor, verticalAnchor2, f25, f26, f17, (i15 & 32) != 0 ? h.n(0) : f18, (i15 & 64) != 0 ? 0.5f : f19);
    }

    public final void a(f other, float bias) {
        n(this, other.getStart(), other.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, null);
    }

    public final void c(f other, float bias) {
        m(this, other.getTop(), other.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, bias, 60, null);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final w getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final f getContainerObject() {
        return this.containerObject;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f0 getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final f0 getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final w getTop() {
        return this.top;
    }

    public final void k(i.HorizontalAnchor top, i.HorizontalAnchor bottom, float topMargin, float bottomMargin, float topGoneMargin, float bottomGoneMargin, float bias) {
        this.top.b(top, topMargin, topGoneMargin);
        this.bottom.b(bottom, bottomMargin, bottomGoneMargin);
        this.containerObject.k0("vBias", bias);
    }

    public final void l(i.VerticalAnchor start, i.VerticalAnchor end, float startMargin, float endMargin, float startGoneMargin, float endGoneMargin, float bias) {
        this.start.a(start, startMargin, startGoneMargin);
        this.end.a(end, endMargin, endGoneMargin);
        this.containerObject.k0("hRtlBias", bias);
    }

    public final void o(t tVar) {
        this.height.b(this, C[1], tVar);
    }

    public final void p(g0 g0Var) {
        this.visibility.b(this, C[2], g0Var);
    }

    public final void q(t tVar) {
        this.width.b(this, C[0], tVar);
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lf5/e$c;", "Lir/c;", "", "initialValue", "", "nameOverride", "<init>", "(Lf5/e;FLjava/lang/String;)V", "Lmr/l;", "property", "oldValue", "newValue", "Loq/i0;", "e", "(Lmr/l;FF)V", "b", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class c extends ObservableProperty<Float> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String nameOverride;

        public c(float f15, String str) {
            super(Float.valueOf(f15));
            this.nameOverride = str;
        }

        @Override // ir.ObservableProperty
        public /* bridge */ /* synthetic */ void c(l lVar, Float f15, Float f16) {
            e(lVar, f15.floatValue(), f16.floatValue());
        }

        protected void e(l<?> property, float oldValue, float newValue) {
            if (Float.isNaN(newValue)) {
                return;
            }
            f containerObject = e.this.getContainerObject();
            String name = this.nameOverride;
            if (name == null) {
                name = property.getName();
            }
            containerObject.k0(name, newValue);
        }

        public /* synthetic */ c(e eVar, float f15, String str, int i15, k kVar) {
            this(f15, (i15 & 2) != 0 ? null : str);
        }
    }
}
