package d02;

import c02.State;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import k30.d;
import mx.c;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import t40.InfoRowListData;
import un0.e;
import x50.NavigationButtonData;
import x50.i;
import xw.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ld02/a;", "Lxw/f;", "Ld02/a$a;", "Lc02/f$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "Lun0/e;", "Lt40/b;", "c", "(Lun0/e;)Lt40/b;", "params", "e", "(Ld02/a$a;)Lc02/f$a;", "a", "Lmx/c;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements f<Params, c02.f.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: d02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Ld02/a$a;", "", "Lc02/e;", "state", "Lkotlin/Function0;", "Loq/i0;", "onCloseAction", "onNextAction", "<init>", "(Lc02/e;Ler/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc02/e;", "c", "()Lc02/e;", "b", "Ler/a;", "()Ler/a;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onCloseAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onNextAction;

        public Params(State state, er.a<i0> aVar, er.a<i0> aVar2) {
            this.state = state;
            this.onCloseAction = aVar;
            this.onNextAction = aVar2;
        }

        public final er.a<i0> a() {
            return this.onCloseAction;
        }

        public final er.a<i0> b() {
            return this.onNextAction;
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
            return t.c(this.state, params.state) && t.c(this.onCloseAction, params.onCloseAction) && t.c(this.onNextAction, params.onNextAction);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onCloseAction.hashCode()) * 31) + this.onNextAction.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onCloseAction=" + this.onCloseAction + ", onNextAction=" + this.onNextAction + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38982a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.PRESIDENTIAL_ELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.SENATE_ELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.SENATE_SUPPLEMENTARY_ELECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.SEJM_ELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.EUROPEAN_PARLIAMENT_ELECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f38982a = iArr;
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    private final InfoRowListData c(e eVar) {
        List listQ;
        int i15 = b.f38982a[eVar.ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            listQ = v.q(new t40.a.C4874a(this.labelProvider.c(fz1.a.f68974t)), new t40.a.C4874a(this.labelProvider.c(fz1.a.f68976u)), new t40.a.C4874a(this.labelProvider.c(fz1.a.f68978v)));
        } else {
            listQ = (i15 == 4 || i15 == 5) ? v.q(new t40.a.C4874a(this.labelProvider.c(fz1.a.f68980w)), new t40.a.C4874a(this.labelProvider.c(fz1.a.f68982x)), new t40.a.C4874a(this.labelProvider.c(fz1.a.f68984y)), new t40.a.C4874a(this.labelProvider.c(fz1.a.f68986z))) : v.n();
        }
        return new InfoRowListData(listQ);
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c02.f.Data b(Params params) {
        return new c02.f.Data(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.a()), this.labelProvider.c(fz1.a.R), null, null, null, 28, null), null, null, null, null, 61, null), mx.b.b(params.getState().getAvailableElectionSupport().getElectionActionName(), "electionActionName"), c(params.getState().getAvailableElectionSupport().getElectionActionType()), new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(fz1.a.I), null, 2, null), d.a.f107773a, null, params.b(), 35, null));
    }
}
