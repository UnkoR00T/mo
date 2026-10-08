package rq1;

import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m50.ServiceWidgetData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import qq1.State;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lrq1/k;", "Lxw/f;", "Lrq1/k$a;", "Lqq1/d$a;", "<init>", "()V", "Lsq1/a;", "Lm50/a;", "i", "(Lsq1/a;)Lm50/a;", "params", "h", "(Lrq1/k$a;)Lqq1/d$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, qq1.d.Data> {

    /* JADX INFO: renamed from: rq1.k$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrq1/k$a;", "", "Lqq1/c;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Lqq1/c;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqq1/c;", "b", "()Lqq1/c;", "Ler/a;", "()Ler/a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        public Params(State state, er.a<i0> aVar) {
            this.state = state;
            this.onBackAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackAction;
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
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction);
        }

        public int hashCode() {
            return (this.state.hashCode() * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f175533a;

        static {
            int[] iArr = new int[sq1.a.values().length];
            try {
                iArr[sq1.a.AIR_QUALITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sq1.a.EPAYMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sq1.a.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f175533a = iArr;
        }
    }

    private final ServiceWidgetData i(sq1.a aVar) {
        int i15 = b.f175533a[aVar.ordinal()];
        if (i15 == 1) {
            int position = aVar.getPosition();
            int i16 = jz.a.G3;
            Label labelB = mx.b.b("Stan na 12:15", "");
            Label labelB2 = mx.b.b("largeContentDesc", "");
            Label labelB3 = mx.b.b("smallContentDesc", "");
            g gVar = g.f175521a;
            return new ServiceWidgetData("testTag", position, i16, labelB, gVar.i(), gVar.j(), new er.a() { // from class: rq1.h
                @Override // er.a
                public final Object a() {
                    return k.l();
                }
            }, labelB3, labelB2, false, 512, null);
        }
        if (i15 == 2) {
            int i17 = jz.a.M3;
            Label labelB4 = mx.b.b("largeContentDesc", "");
            Label labelB5 = mx.b.b("smallContentDesc", "");
            g gVar2 = g.f175521a;
            return new ServiceWidgetData("", 2, i17, null, gVar2.g(), gVar2.k(), new er.a() { // from class: rq1.i
                @Override // er.a
                public final Object a() {
                    return k.m();
                }
            }, labelB5, labelB4, false, 520, null);
        }
        if (i15 != 3) {
            throw new p();
        }
        int i18 = jz.a.f106833o0;
        Label labelB6 = mx.b.b("First", "");
        Label labelB7 = mx.b.b("largeContentDesc", "");
        Label labelB8 = mx.b.b("smallContentDesc", "");
        g gVar3 = g.f175521a;
        return new ServiceWidgetData("", 3, i18, labelB6, gVar3.l(), gVar3.h(), new er.a() { // from class: rq1.j
            @Override // er.a
            public final Object a() {
                return k.q();
            }
        }, labelB8, labelB7, false, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q() {
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public qq1.d.Data b(Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), mx.b.b("Service Widget (1.0.0)", ""), null, null, null, 28, null), null, null, null, null, 61, null);
        Set<sq1.a> setA = params.getState().a();
        ArrayList arrayList = new ArrayList(v.y(setA, 10));
        Iterator<T> it = setA.iterator();
        while (it.hasNext()) {
            arrayList.add(i((sq1.a) it.next()));
        }
        return new qq1.d.Data(baseScaffoldData, v.k1(arrayList), params.a());
    }
}
