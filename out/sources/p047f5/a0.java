package p047f5;

import c5.c;
import c5.d;
import c5.s;
import c5.t;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k5.h;
import lr.m;
import n5.e;
import n5.f;
import n5.l;
import o5.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.f0;
import p036e4.v0;
import p071kotlin.Metadata;
import r0.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JO\u0010\u0013\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u0018*\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%JR\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-2\u0006\u00100\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0018H\u0000¢\u0006\u0004\b4\u0010%J\u001a\u00105\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0004ø\u0001\u0000¢\u0006\u0004\b5\u00106J3\u00108\u001a\u00020\u0018*\u0002072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b:\u0010%R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010<R\u001a\u0010B\u001a\u00020>8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\"\u0010?\u001a\u0004\b@\u0010AR.\u0010H\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020.0-8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b5\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010I\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00150-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010CR&\u0010L\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020J0-8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0019\u0010C\u001a\u0004\bK\u0010ER\u001a\u0010Q\u001a\u00020M8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b \u0010N\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010RR\u0014\u0010T\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010RR\"\u0010[\u001a\u00020U8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"Lf5/a0;", "Lo5/b$b;", "Lf5/s;", "Lc5/d;", "density", "<init>", "(Lc5/d;)V", "Ln5/e$b;", "dimensionBehaviour", "", "dimension", "matchConstraintDefaultDimension", "measureStrategy", "", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "", "outConstraints", "g", "(Ln5/e$b;IIIZZI[I)Z", "", "Lo5/b$a;", "measure", "Loq/i0;", "e", "([Ljava/lang/Integer;Lo5/b$a;)V", "Ln5/e;", "constraintWidget", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Lr0/n;", "f", "(Ln5/e;J)J", "b", "(Ln5/e;Lo5/b$a;)V", "d", "()V", "Lc5/t;", "layoutDirection", "Lf5/o;", "constraintSet", "", "Le4/v0;", "measurables", "", "Le4/a2;", "placeableMap", "optimizationLevel", "Lc5/r;", "i", "(JLc5/t;Lf5/o;Ljava/util/List;Ljava/util/Map;I)J", "j", "c", "(J)V", "Le4/a2$a;", "h", "(Le4/a2$a;Ljava/util/List;Ljava/util/Map;)V", "a", "", "Ljava/lang/String;", "computedLayoutResult", "Ln5/f;", "Ln5/f;", "getRoot", "()Ln5/f;", "root", "Ljava/util/Map;", "getPlaceables", "()Ljava/util/Map;", "setPlaceables", "(Ljava/util/Map;)V", "placeables", "lastMeasures", "Lk5/h;", "getFrameCache", "frameCache", "Lf5/d0;", "Lf5/d0;", "getState", "()Lf5/d0;", "state", "[I", "widthConstraintsHolder", "heightConstraintsHolder", "", "F", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "forcedScaleFactor", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a0 implements b.InterfaceC3522b, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String computedLayoutResult = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f root;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Map<v0, a2> placeables;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer[]> lastMeasures;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, h> frameCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d0 state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int[] widthConstraintsHolder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int[] heightConstraintsHolder;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float forcedScaleFactor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59156a;

        static {
            int[] iArr = new int[e.b.values().length];
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.b.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f59156a = iArr;
        }
    }

    public a0(d dVar) {
        f fVar = new f(0, 0);
        fVar.a2(this);
        this.root = fVar;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = new d0(dVar);
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
    }

    private final void e(Integer[] numArr, b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f142372e);
        numArr[1] = Integer.valueOf(aVar.f142373f);
        numArr[2] = Integer.valueOf(aVar.f142374g);
    }

    private final long f(e constraintWidget, long constraints) {
        int i15;
        Object objS = constraintWidget.s();
        String str = constraintWidget.f131867o;
        int i16 = 0;
        if (!(constraintWidget instanceof l)) {
            if (objS instanceof v0) {
                a2 a2VarO0 = ((v0) objS).o0(constraints);
                this.placeables.put((v0) objS, a2VarO0);
                return n.b(a2VarO0.getWidth(), a2VarO0.getHeight());
            }
            c2.g("CCL", "Nothing to measure for widget: " + str);
            return n.b(0, 0);
        }
        if (c5.b.j(constraints)) {
            i15 = 1073741824;
        } else {
            i15 = c5.b.h(constraints) ? Integer.MIN_VALUE : 0;
        }
        if (c5.b.i(constraints)) {
            i16 = 1073741824;
        } else if (c5.b.g(constraints)) {
            i16 = Integer.MIN_VALUE;
        }
        l lVar = (l) constraintWidget;
        lVar.F1(i15, c5.b.l(constraints), i16, c5.b.k(constraints));
        return n.b(lVar.A1(), lVar.z1());
    }

    private final boolean g(e.b dimensionBehaviour, int dimension, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i15 = a.f59156a[dimensionBehaviour.ordinal()];
        if (i15 == 1) {
            outConstraints[0] = dimension;
            outConstraints[1] = dimension;
            return false;
        }
        if (i15 == 2) {
            outConstraints[0] = 0;
            outConstraints[1] = rootMaxConstraint;
            return true;
        }
        if (i15 == 3) {
            boolean z15 = currentDimensionResolved || ((measureStrategy == b.a.f142366l || measureStrategy == b.a.f142367m) && (measureStrategy == b.a.f142367m || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
            outConstraints[0] = z15 ? dimension : 0;
            if (!z15) {
                dimension = rootMaxConstraint;
            }
            outConstraints[1] = dimension;
            return !z15;
        }
        if (i15 == 4) {
            outConstraints[0] = rootMaxConstraint;
            outConstraints[1] = rootMaxConstraint;
            return false;
        }
        throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
    }

    @Override // o5.b.InterfaceC3522b
    public void a() {
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x011d  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x009f, please report this as an issue */
    @Override // o5.b.InterfaceC3522b
    public void b(e constraintWidget, b.a measure) {
        long jF;
        Integer numValueOf;
        Integer numValueOf2;
        int iIntValue;
        Integer numValueOf3;
        int iIntValue2;
        boolean z15;
        String str = constraintWidget.f131867o;
        Integer[] numArr = this.lastMeasures.get(str);
        g(measure.f142368a, measure.f142370c, constraintWidget.f131883w, measure.f142377j, (numArr != null ? numArr[1].intValue() : 0) == constraintWidget.x(), constraintWidget.p0(), c5.b.l(this.state.getRootIncomingConstraints()), this.widthConstraintsHolder);
        g(measure.f142369b, measure.f142371d, constraintWidget.f131885x, measure.f142377j, (numArr != null ? numArr[0].intValue() : 0) == constraintWidget.Y(), constraintWidget.q0(), c5.b.k(this.state.getRootIncomingConstraints()), this.heightConstraintsHolder);
        int[] iArr = this.widthConstraintsHolder;
        int i15 = iArr[0];
        int i16 = iArr[1];
        int[] iArr2 = this.heightConstraintsHolder;
        long jA = c.a(i15, i16, iArr2[0], iArr2[1]);
        int i17 = measure.f142377j;
        if (i17 == b.a.f142366l || i17 == b.a.f142367m) {
            jF = f(constraintWidget, jA);
            constraintWidget.b1(false);
            Integer numValueOf4 = Integer.valueOf(n.e(jF));
            numValueOf = Integer.valueOf(constraintWidget.f131889z);
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            numValueOf2 = Integer.valueOf(constraintWidget.A);
            if (numValueOf2.intValue() <= 0) {
                numValueOf2 = null;
            }
            iIntValue = ((Number) m.p(numValueOf4, numValueOf, numValueOf2)).intValue();
            Integer numValueOf5 = Integer.valueOf(n.f(jF));
            numValueOf3 = Integer.valueOf(constraintWidget.C);
            if (numValueOf3.intValue() <= 0) {
                numValueOf3 = null;
            }
            Integer numValueOf6 = Integer.valueOf(constraintWidget.D);
            iIntValue2 = ((Number) m.p(numValueOf5, numValueOf3, numValueOf6.intValue() > 0 ? numValueOf6 : null)).intValue();
            if (iIntValue != n.e(jF)) {
                jA = c.a(iIntValue, iIntValue, c5.b.m(jA), c5.b.k(jA));
                z15 = true;
            } else {
                z15 = false;
            }
            if (iIntValue2 != n.f(jF)) {
                jA = c.a(c5.b.n(jA), c5.b.l(jA), iIntValue2, iIntValue2);
                z15 = true;
            }
            if (z15) {
                f(constraintWidget, jA);
                constraintWidget.b1(false);
            }
        } else {
            e.b bVar = measure.f142368a;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar != bVar2 || constraintWidget.f131883w != 0 || measure.f142369b != bVar2 || constraintWidget.f131885x != 0) {
                jF = f(constraintWidget, jA);
                constraintWidget.b1(false);
                Integer numValueOf7 = Integer.valueOf(n.e(jF));
                numValueOf = Integer.valueOf(constraintWidget.f131889z);
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                numValueOf2 = Integer.valueOf(constraintWidget.A);
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) m.p(numValueOf7, numValueOf, numValueOf2)).intValue();
                Integer numValueOf8 = Integer.valueOf(n.f(jF));
                numValueOf3 = Integer.valueOf(constraintWidget.C);
                if (numValueOf3.intValue() <= 0) {
                    numValueOf3 = null;
                }
                Integer numValueOf9 = Integer.valueOf(constraintWidget.D);
                iIntValue2 = ((Number) m.p(numValueOf8, numValueOf3, numValueOf9.intValue() > 0 ? numValueOf9 : null)).intValue();
                if (iIntValue != n.e(jF)) {
                    jA = c.a(iIntValue, iIntValue, c5.b.m(jA), c5.b.k(jA));
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (iIntValue2 != n.f(jF)) {
                    jA = c.a(c5.b.n(jA), c5.b.l(jA), iIntValue2, iIntValue2);
                    z15 = true;
                }
                if (z15) {
                    f(constraintWidget, jA);
                    constraintWidget.b1(false);
                }
            }
        }
        a2 a2Var = this.placeables.get(constraintWidget.s());
        measure.f142372e = a2Var != null ? a2Var.getWidth() : constraintWidget.Y();
        measure.f142373f = a2Var != null ? a2Var.getHeight() : constraintWidget.x();
        int I = (a2Var == null || !this.state.q(constraintWidget)) ? Integer.MIN_VALUE : a2Var.I(p036e4.b.a());
        measure.f142375h = I != Integer.MIN_VALUE;
        measure.f142374g = I;
        Map<String, Integer[]> map = this.lastMeasures;
        Integer[] numArr2 = map.get(str);
        if (numArr2 == null) {
            numArr2 = new Integer[]{0, 0, Integer.valueOf(PKIFailureInfo.systemUnavail)};
            map.put(str, numArr2);
        }
        e(numArr2, measure);
        measure.f142376i = (measure.f142372e == measure.f142370c && measure.f142373f == measure.f142371d) ? false : true;
    }

    protected final void c(long constraints) {
        this.root.n1(c5.b.l(constraints));
        this.root.O0(c5.b.k(constraints));
        this.forcedScaleFactor = Float.NaN;
    }

    public void d() {
        e eVar;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("{ ");
        sb5.append("  root: {");
        sb5.append("interpolated: { left:  0,");
        sb5.append("  top:  0,");
        sb5.append("  right:   " + this.root.Y() + " ,");
        sb5.append("  bottom:  " + this.root.x() + " ,");
        sb5.append(" } }");
        for (e eVar2 : this.root.v1()) {
            Object objS = eVar2.s();
            if (objS instanceof v0) {
                h hVar = null;
                if (eVar2.f131867o == null) {
                    v0 v0Var = (v0) objS;
                    Object objA = f0.a(v0Var);
                    if (objA == null) {
                        objA = m.a(v0Var);
                    }
                    eVar2.f131867o = objA != null ? objA.toString() : null;
                }
                h hVar2 = this.frameCache.get(b0.a((v0) objS));
                if (hVar2 != null && (eVar = hVar2.f108556a) != null) {
                    hVar = eVar.f131865n;
                }
                if (hVar != null) {
                    sb5.append(' ' + eVar2.f131867o + ": {");
                    sb5.append(" interpolated : ");
                    hVar.d(sb5, true);
                    sb5.append("}, ");
                }
            } else if (eVar2 instanceof n5.h) {
                sb5.append(' ' + eVar2.f131867o + ": {");
                n5.h hVar3 = (n5.h) eVar2;
                if (hVar3.v1() == 0) {
                    sb5.append(" type: 'hGuideline', ");
                } else {
                    sb5.append(" type: 'vGuideline', ");
                }
                sb5.append(" interpolated: ");
                sb5.append(" { left: " + hVar3.Z() + ", top: " + hVar3.a0() + ", right: " + (hVar3.Z() + hVar3.Y()) + ", bottom: " + (hVar3.a0() + hVar3.x()) + " }");
                sb5.append("}, ");
            }
        }
        sb5.append(" }");
        this.computedLayoutResult = sb5.toString();
    }

    public final void h(a2.a aVar, List<? extends v0> list, Map<v0, a2> map) {
        a2 a2Var;
        a2.a aVar2;
        this.placeables = map;
        int i15 = 0;
        if (this.frameCache.isEmpty()) {
            ArrayList<e> arrayListV1 = this.root.v1();
            int size = arrayListV1.size();
            for (int i16 = 0; i16 < size; i16++) {
                e eVar = arrayListV1.get(i16);
                Object objS = eVar.s();
                if (objS instanceof v0) {
                    this.frameCache.put(b0.a((v0) objS), new h(eVar.f131865n.i()));
                }
            }
        }
        int size2 = list.size();
        while (i15 < size2) {
            v0 v0Var = list.get(i15);
            h hVar = this.frameCache.get(b0.a(v0Var));
            if (hVar == null || (a2Var = this.placeables.get(v0Var)) == null) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                j.d(aVar2, a2Var, hVar, 0L, 4, null);
            }
            i15++;
            aVar = aVar2;
        }
        if (x.BOUNDS == null) {
            d();
        }
    }

    public final long i(long constraints, t layoutDirection, o constraintSet, List<? extends v0> measurables, Map<v0, a2> placeableMap, int optimizationLevel) {
        this.placeables = placeableMap;
        if (measurables.isEmpty()) {
            return s.a(c5.b.n(constraints), c5.b.m(constraints));
        }
        this.state.C(c5.b.j(constraints) ? k5.d.b(c5.b.l(constraints)) : k5.d.h().n(c5.b.n(constraints)));
        this.state.m(c5.b.i(constraints) ? k5.d.b(c5.b.k(constraints)) : k5.d.h().n(c5.b.m(constraints)));
        this.state.f108497f.E().a(this.state, this.root, 0);
        this.state.f108497f.C().a(this.state, this.root, 1);
        this.state.G(constraints);
        this.state.x(layoutDirection == t.Rtl);
        j();
        if (constraintSet.a(measurables)) {
            this.state.u();
            constraintSet.b(this.state, measurables);
            j.a(this.state, measurables);
            this.state.a(this.root);
        } else {
            j.a(this.state, measurables);
        }
        c(constraints);
        this.root.f2();
        this.root.b2(optimizationLevel);
        f fVar = this.root;
        fVar.W1(fVar.O1(), 0, 0, 0, 0, 0, 0, 0, 0);
        return s.a(this.root.Y(), this.root.x());
    }

    public final void j() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }
}
