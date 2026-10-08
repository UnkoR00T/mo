package po1;

import i50.BaseScaffoldData;
import n30.CardListData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;
import x50.NavigationButtonData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpo1/c0;", "Lxw/f;", "Lpo1/c0$a;", "Lpo1/t$a;", "<init>", "()V", "params", "e", "(Lpo1/c0$a;)Lpo1/t$a;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 implements xw.f<Params, t.Data> {

    /* JADX INFO: renamed from: po1.c0$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpo1/c0$a;", "", "Lpo1/s;", "state", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lkotlin/Function1;", "Loo1/p;", "onChooseDestination", "<init>", "(Lpo1/s;Ler/a;Ler/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lpo1/s;", "c", "()Lpo1/s;", "b", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onClose;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<p094oo1.p, oq.i0> onChooseDestination;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<oq.i0> aVar, er.l<? super p094oo1.p, oq.i0> lVar) {
            this.state = state;
            this.onClose = aVar;
            this.onChooseDestination = lVar;
        }

        public final er.l<p094oo1.p, oq.i0> a() {
            return this.onChooseDestination;
        }

        public final er.a<oq.i0> b() {
            return this.onClose;
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
            return fr.t.c(this.state, params.state) && fr.t.c(this.onClose, params.onClose) && fr.t.c(this.onChooseDestination, params.onChooseDestination);
        }

        public int hashCode() {
            return (((this.state.hashCode() * 31) + this.onClose.hashCode()) * 31) + this.onChooseDestination.hashCode();
        }

        public String toString() {
            return "Params(state=" + this.state + ", onClose=" + this.onClose + ", onChooseDestination=" + this.onChooseDestination + ')';
        }
    }

    private static final DefaultSingleCardData f(final Params params, String str, final p094oo1.p pVar) {
        return new DefaultSingleCardData("card", new er.a() { // from class: po1.b0
            @Override // er.a
            public final Object a() {
                return c0.h(params, pVar);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(n50.l.b(mx.b.b(str, ""), null, null, 3, null)), null, 5, null), null, n50.x0.Icon.INSTANCE.b(), null, 2812, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(Params params, p094oo1.p pVar) {
        params.a().b(pVar);
        return oq.i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public t.Data b(Params params) {
        return new t.Data(new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), mx.b.b("Developer Console", "ScreenTitle"), null, null, null, 28, null), null, null, null, null, 61, null), new t.Data.AppInfo(mx.b.b("Version:", "AppVersion"), mx.b.d(params.getState().getAppVersion(), "AppVersionValue"), mx.b.b("Build type:", "BuildType"), mx.b.d(params.getState().getBuildType(), "BuildTypeValue"), mx.b.b("Current app commit SHA:", "CurrentCommitSha"), mx.b.d(params.getState().getCurrentCommitSha(), "CurrentCommitShaValue")), mx.b.b("App info", "AppInfoSectionTitle"), mx.b.b("Developer screens", "ScreensSectionTitle"), new CardListData(pq.v.q(f(params, "Design System", oo1.p.h.f147674a), f(params, "Designer (Custom Components)", oo1.p.j.f147700a), f(params, "Shared screens example", oo1.p.g0.f147672a), f(params, "Database sample", oo1.p.e.f147560a), f(params, "Validators", oo1.p.n0.f147718a), f(params, "Feature flags", oo1.p.o.f147720a), f(params, "Permissions", oo1.p.y.f147740a), f(params, "Remote logger", oo1.p.a0.f147546a), f(params, "Request", oo1.p.b0.f147550a), f(params, "Biometric options", oo1.p.b.f147548a), f(params, "Paging", oo1.p.w.f147736a), f(params, "Pull to refresh", oo1.p.z.f147742a), f(params, "Crypto", oo1.p.d.f147556a), f(params, "Keyguard", oo1.p.t.f147730a), f(params, "Edo", oo1.p.m.f147712a), f(params, "Parser", oo1.p.x.f147738a), f(params, "Local notifications", oo1.p.u.f147732a), f(params, "Search address", oo1.p.c0.f147554a), f(params, "Mock servers", oo1.p.v.f147734a), f(params, "Set app version", oo1.p.e0.f147562a), f(params, "File uploader", p094oo1.p.C3669p.f147722a), f(params, "Type safe navigation example", oo1.p.q.f147724a), f(params, "Teryt", oo1.p.h0.f147676a), f(params, "Teryt (Restricted To City)", oo1.p.k0.f147706a), f(params, "Teryt (optional fields)", oo1.p.j0.f147702a), f(params, "Teryt (custom)", oo1.p.i0.f147698a)), null, false, null, null, 30, null), params.b());
    }
}
