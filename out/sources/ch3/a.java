package ch3;

import bh3.g;
import bh3.h;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import k30.d;
import md3.b;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.v;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import q40.j;
import t40.InfoRowListData;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lch3/a;", "Lxw/f;", "Lch3/a$a;", "Lbh3/h$a;", "Lmx/c;", AnnotatedPrivateKey.LABEL, "Lje3/c;", "vehicleCollisionStatementFormatter", "<init>", "(Lmx/c;Lje3/c;)V", "Lbh3/g$b$a;", "successScreenType", "Lmx/a;", "f", "(Lbh3/g$b$a;)Lmx/a;", "Lt40/b;", "e", "(Lbh3/g$b$a;)Lt40/b;", "params", "Lq40/f;", "c", "(Lch3/a$a;Lbh3/g$b$a;)Lq40/f;", "h", "(Lch3/a$a;)Lbh3/h$a;", "a", "Lmx/c;", "b", "Lje3/c;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, h.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final je3.c vehicleCollisionStatementFormatter;

    /* JADX INFO: renamed from: ch3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001d"}, d2 = {"Lch3/a$a;", "", "Lbh3/g;", "state", "Lkotlin/Function0;", "Loq/i0;", "onGoToReport", "onDownloadClicked", "close", "<init>", "(Lbh3/g;Ler/a;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbh3/g;", "d", "()Lbh3/g;", "b", "Ler/a;", "c", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onGoToReport;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onDownloadClicked;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> close;

        public Params(g gVar, er.a<i0> aVar, er.a<i0> aVar2, er.a<i0> aVar3) {
            this.state = gVar;
            this.onGoToReport = aVar;
            this.onDownloadClicked = aVar2;
            this.close = aVar3;
        }

        public final er.a<i0> a() {
            return this.close;
        }

        public final er.a<i0> b() {
            return this.onDownloadClicked;
        }

        public final er.a<i0> c() {
            return this.onGoToReport;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final g getState() {
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
            return t.c(this.state, params.state) && t.c(this.onGoToReport, params.onGoToReport) && t.c(this.onDownloadClicked, params.onDownloadClicked) && t.c(this.close, params.close);
        }

        public int hashCode() {
            return (((((this.state.hashCode() * 31) + this.onGoToReport.hashCode()) * 31) + this.onDownloadClicked.hashCode()) * 31) + this.close.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onGoToReport=" + this.onGoToReport + ", onDownloadClicked=" + this.onDownloadClicked + ", close=" + this.close + ')';
        }
    }

    public a(c cVar, je3.c cVar2) {
        this.label = cVar;
        this.vehicleCollisionStatementFormatter = cVar2;
    }

    private final IconPageBottomContentData c(Params params, g.Initialized.a successScreenType) {
        if (!t.c(successScreenType, g.Initialized.a.C0507b.f19656a)) {
            if (!t.c(successScreenType, g.Initialized.a.C0506a.f19655a)) {
                throw new p();
            }
            return new IconPageBottomContentData(new ButtonData("DownloadStatementButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.label.c(b.f125824s4), null, 2, null), d.a.f107773a, null, params.b(), 34, null), null, null, 4, null);
        }
        return new IconPageBottomContentData(new ButtonData("ReportDamageButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.label.c(b.f125840u4), null, 2, null), d.a.f107773a, null, params.c(), 34, null), new ButtonData("DownloadStatementButton", null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.label.c(b.f125824s4), null, 2, null), new d.Secondary(null, 1, null), null, params.b(), 34, null), null, 4, null);
    }

    private final InfoRowListData e(g.Initialized.a successScreenType) {
        if (t.c(successScreenType, g.Initialized.a.C0507b.f19656a)) {
            return new InfoRowListData(v.q(new t40.a.C4874a(this.label.c(b.f125848v4)), new t40.a.C4874a(this.label.c(b.f125856w4))));
        }
        if (t.c(successScreenType, g.Initialized.a.C0506a.f19655a)) {
            return null;
        }
        throw new p();
    }

    private final Label f(g.Initialized.a successScreenType) {
        if (t.c(successScreenType, g.Initialized.a.C0507b.f19656a)) {
            return null;
        }
        if (t.c(successScreenType, g.Initialized.a.C0506a.f19655a)) {
            return this.label.c(b.f125832t4);
        }
        throw new p();
    }

    @Override // er.l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public h.a b(Params params) {
        g state = params.getState();
        if (t.c(state, g.a.f19651a)) {
            return h.a.C0508a.f19657a;
        }
        if (!(state instanceof g.Initialized)) {
            throw new p();
        }
        g.Initialized initialized = (g.Initialized) state;
        return new h.a.Initialized(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.a()), null, null, null, null, 30, null), null, null, null, null, 61, null), new IconPageData(j.b.c.f164688d, this.vehicleCollisionStatementFormatter.a("SuccessTitle", initialized.getStatementReady().getStatementNumber()), f(initialized.getSuccessScreenType()), null, e(initialized.getSuccessScreenType()), c(params, initialized.getSuccessScreenType()), true, 8, null));
    }
}
