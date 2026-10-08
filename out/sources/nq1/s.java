package nq1;

import a50.RadioButtonData;
import android.content.Context;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003,+)B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0081\u0001\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00120\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lnq1/s;", "Lxw/f;", "Lnq1/s$c;", "Lnq1/v$a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lb50/e;", "radioButtonVariant", "Lb50/d;", "state", "", "selectedIndex", "Lmx/a;", AnnotatedPrivateKey.LABEL, "description", "Lkotlin/Function0;", "Loq/i0;", "onClickHelperIcon", "Lb50/a;", "content", "", "enabled", "Lkotlin/Function1;", "onClick", "La50/a;", "T", "(Lb50/e;Lb50/d;Ljava/lang/Integer;Lmx/a;Lmx/a;Ler/a;Lb50/a;ZLer/l;)La50/a;", ip.a.f96137b, "()Lmx/a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Lb50/d$b;", "R", "()Lb50/d$b;", "Lb50/d$a;", "Q", "()Lb50/d$a;", "params", "z", "(Lnq1/s$c;)Lnq1/v$a;", "a", "Landroid/content/Context;", "b", "c", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s implements xw.f<Params, v.Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f137753c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnq1/s$b;", "Lb50/a;", "<init>", "()V", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/p;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements b50.a {
        @Override // b50.a
        public er.p<p076m2.r, Integer, oq.i0> a() {
            return c.f137731a.c();
        }
    }

    /* JADX INFO: renamed from: nq1.s$c, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnq1/s$c;", "", "Lnq1/u;", "state", "Lkotlin/Function1;", "Lnq1/t;", "Loq/i0;", "dispatch", "<init>", "(Lnq1/u;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnq1/u;", "b", "()Lnq1/u;", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<t, oq.i0> dispatch;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.l<? super t, oq.i0> lVar) {
            this.state = state;
            this.dispatch = lVar;
        }

        public final er.l<t, oq.i0> a() {
            return this.dispatch;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.state, params.state) && fr.t.c(this.dispatch, params.dispatch);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.dispatch.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", dispatch=" + this.dispatch + ')';
        }
    }

    public s(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(Params params, int i15) {
        params.a().b(new t.MutateDefaultSelectedIndex(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(int i15) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(Params params) {
        params.a().b(t.a.f137757a);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(s sVar) {
        t70.s.M(sVar.context, "onClickHelperIcon");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(Params params, int i15) {
        params.a().b(new t.MutateDefaultWithOptionalsSelectedIndex(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(Params params, int i15) {
        params.a().b(new t.MutateDefaultErrorSelectedIndex(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(Params params, int i15) {
        params.a().b(new t.MutateContentBoxSelectedIndex(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(int i15) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(s sVar) {
        t70.s.M(sVar.context, "onClickHelperIcon");
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(Params params, int i15) {
        params.a().b(new t.MutateContentBoxWithOptionalsSelectedIndex(i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O(Params params, int i15) {
        params.a().b(new t.MutateContentBoxErrorSelectedIndex(i15));
        return oq.i0.f148189a;
    }

    private final Label P() {
        return mx.b.b("Description", "");
    }

    private final b50.d.Error Q() {
        return new b50.d.Error(mx.b.b("Error", ""));
    }

    private final b50.d.Helper R() {
        return new b50.d.Helper(mx.b.b("HelperText", ""));
    }

    private final Label S() {
        return mx.b.b("Etykieta", "");
    }

    private final RadioButtonData T(b50.e radioButtonVariant, b50.d state, Integer selectedIndex, Label label, Label description, er.a<oq.i0> onClickHelperIcon, b50.a content, boolean enabled, final er.l<? super Integer, oq.i0> onClick) {
        return new RadioButtonData(pq.v.q(new RadioButtonRow(new RadioButtonItemData(enabled, selectedIndex != null && selectedIndex.intValue() == 0, false, 4, null), new er.a() { // from class: nq1.h
            @Override // er.a
            public final Object a() {
                return s.V(onClick);
            }
        }, S(), description, content), new RadioButtonRow(new RadioButtonItemData(enabled, selectedIndex != null && selectedIndex.intValue() == 1, false, 4, null), new er.a() { // from class: nq1.i
            @Override // er.a
            public final Object a() {
                return s.W(onClick);
            }
        }, S(), null, content, 8, null)), radioButtonVariant, state, label, onClickHelperIcon, null, null, 96, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ RadioButtonData U(s sVar, b50.e eVar, b50.d dVar, Integer num, Label label, Label label2, er.a aVar, b50.a aVar2, boolean z15, er.l lVar, int i15, Object obj) {
        return sVar.T(eVar, (i15 & 2) != 0 ? new b50.d.Helper(null, 1, null) : dVar, (i15 & 4) != 0 ? null : num, (i15 & 8) != 0 ? null : label, (i15 & 16) != 0 ? null : label2, (i15 & 32) != 0 ? null : aVar, (i15 & 64) != 0 ? null : aVar2, (i15 & 128) != 0 ? true : z15, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V(er.l lVar) {
        lVar.b(0);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W(er.l lVar) {
        lVar.b(1);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public v.Data b(final Params params) {
        Label labelB = mx.b.b("RadioButtonDefault", "");
        b50.e.b bVar = b50.e.b.f16685a;
        oq.r rVarA = oq.y.a(labelB, U(this, bVar, null, params.getState().getDefaultSelectedIndex(), null, null, null, null, false, new er.l() { // from class: nq1.f
            @Override // er.l
            public final Object b(Object obj) {
                return s.E(params, ((Integer) obj).intValue());
            }
        }, 250, null));
        oq.r rVarA2 = oq.y.a(mx.b.b("RadioButtonDefaultDisabled", ""), U(this, bVar, null, 0, null, null, null, null, false, new er.l() { // from class: nq1.k
            @Override // er.l
            public final Object b(Object obj) {
                return s.F(((Integer) obj).intValue());
            }
        }, 122, null));
        oq.r rVarA3 = oq.y.a(mx.b.b("RadioButtonDefaultWithOptionals", ""), U(this, bVar, R(), params.getState().getDefaultWithOptionalsSelectedIndex(), S(), P(), new er.a() { // from class: nq1.l
            @Override // er.a
            public final Object a() {
                return s.H(this.f137746a);
            }
        }, new b(), false, new er.l() { // from class: nq1.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.I(params, ((Integer) obj).intValue());
            }
        }, 128, null));
        oq.r rVarA4 = oq.y.a(mx.b.b("RadioButtonDefaultError", ""), U(this, bVar, Q(), params.getState().getDefaultErrorSelectedIndex(), S(), null, null, null, false, new er.l() { // from class: nq1.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.J(params, ((Integer) obj).intValue());
            }
        }, 240, null));
        Label labelB2 = mx.b.b("RadioButtonContentBox", "");
        b50.e.a aVar = b50.e.a.f16684a;
        return new v.Data(v0.l(rVarA, rVarA2, rVarA3, rVarA4, oq.y.a(labelB2, U(this, aVar, null, params.getState().getContentBoxSelectedIndex(), null, null, null, null, false, new er.l() { // from class: nq1.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.K(params, ((Integer) obj).intValue());
            }
        }, 250, null)), oq.y.a(mx.b.b("RadioButtonContentBoxDisabled", ""), U(this, aVar, null, 0, null, null, null, null, false, new er.l() { // from class: nq1.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.L(((Integer) obj).intValue());
            }
        }, 122, null)), oq.y.a(mx.b.b("RadioButtonContentBoxWithOptionals", ""), U(this, aVar, R(), params.getState().getContentBoxWithOptionalsSelectedIndex(), S(), P(), new er.a() { // from class: nq1.q
            @Override // er.a
            public final Object a() {
                return s.M(this.f137750a);
            }
        }, new b(), false, new er.l() { // from class: nq1.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.N(params, ((Integer) obj).intValue());
            }
        }, 128, null)), oq.y.a(mx.b.b("RadioButtonContentBoxError", ""), U(this, aVar, Q(), params.getState().getContentBoxErrorSelectedIndex(), S(), null, null, null, false, new er.l() { // from class: nq1.g
            @Override // er.l
            public final Object b(Object obj) {
                return s.O(params, ((Integer) obj).intValue());
            }
        }, 240, null))), new er.a() { // from class: nq1.j
            @Override // er.a
            public final Object a() {
                return s.G(params);
            }
        });
    }
}
