package ao2;

import er.l;
import fr.t;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import mx.b;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import xl2.q5;
import xw.f;
import zn2.State;
import zn2.e;
import zn2.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lao2/a;", "Lxw/f;", "Lao2/a$b;", "Lzn2/g$a;", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "<init>", "(Lmx/c;Lu04/a;)V", "Lmx/a;", "Lt40/a$a;", "e", "(Lmx/a;)Lt40/a$a;", "params", "c", "(Lao2/a$b;)Lzn2/g$a;", "a", "Lmx/c;", "b", "Lu04/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, g.Data> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13956d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: ao2.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lao2/a$b;", "", "Lzn2/f;", "state", "Lkotlin/Function1;", "", "Loq/i0;", "onHelperButtonClick", "Lkotlin/Function0;", "onBackButtonAction", "<init>", "(Lzn2/f;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzn2/f;", "c", "()Lzn2/f;", "b", "Ler/l;", "()Ler/l;", "Ler/a;", "()Ler/a;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final l<String, i0> onHelperButtonClick;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackButtonAction;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, l<? super String, i0> lVar, er.a<i0> aVar) {
            this.state = state;
            this.onHelperButtonClick = lVar;
            this.onBackButtonAction = aVar;
        }

        public final er.a<i0> a() {
            return this.onBackButtonAction;
        }

        public final l<String, i0> b() {
            return this.onHelperButtonClick;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return t.c(this.state, params.state) && t.c(this.onHelperButtonClick, params.onHelperButtonClick) && t.c(this.onBackButtonAction, params.onBackButtonAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onHelperButtonClick.hashCode()) * 31) + this.onBackButtonAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onHelperButtonClick=" + this.onHelperButtonClick + ", onBackButtonAction=" + this.onBackButtonAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13962a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13962a = iArr;
        }
    }

    public a(mx.c cVar, u04.a aVar) {
        this.labelProvider = cVar;
        this.commonEndpoints = aVar;
    }

    private final t40.a.C4874a e(Label label) {
        return new t40.a.C4874a(label);
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g.Data b(Params params) {
        int i15 = c.f13962a[params.getState().getScreenType().ordinal()];
        if (i15 == 1) {
            Label labelC = this.labelProvider.c(q5.Z0);
            Label labelB = b.b("8080", "headerValue");
            List listQ = v.q(this.labelProvider.c(q5.Y0), this.labelProvider.c(q5.f219534b1), this.labelProvider.c(q5.f219537c1));
            ArrayList arrayList = new ArrayList(v.y(listQ, 10));
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                arrayList.add(e((Label) it.next()));
            }
            return new g.Data(labelC, labelB, new InfoRowListData(arrayList), null, new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q5.f219540d1), null, null, false, null, 60, null), null, null, null, null, 61, null));
        }
        if (i15 != 2) {
            throw new p();
        }
        Label labelC2 = this.labelProvider.c(q5.S0);
        Label labelB2 = b.b("incydent.cert.pl", "headerValue");
        List listQ2 = v.q(this.labelProvider.c(q5.R0), this.labelProvider.c(q5.U0), this.labelProvider.c(q5.W0));
        ArrayList arrayList2 = new ArrayList(v.y(listQ2, 10));
        Iterator it4 = listQ2.iterator();
        while (it4.hasNext()) {
            arrayList2.add(e((Label) it4.next()));
        }
        return new g.Data(labelC2, labelB2, new InfoRowListData(arrayList2), new LinkData(null, this.labelProvider.c(q5.V0), this.commonEndpoints.j0(), LinkData.EnumC5775a.WEBSITE, false, params.b(), 17, null), new BaseScaffoldData(null, new i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(q5.X0), null, null, false, null, 60, null), null, null, null, null, 61, null));
    }
}
