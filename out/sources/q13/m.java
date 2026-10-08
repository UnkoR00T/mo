package q13;

import er.p;
import fr.t;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p13.State;
import pq.v;
import t40.InfoRowListData;
import x40.LinkData;
import x50.NavigationButtonData;
import y60.MediaPlayerComponentData;
import yx.MediaPlayerState;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq13/m;", "Lxw/f;", "Lq13/m$a;", "Lp13/j$a;", "Lmx/c;", "labelProvider", "Lh13/a;", "safetyGuideEndpoints", "<init>", "(Lmx/c;Lh13/a;)V", "params", "x", "(Lq13/m$a;)Lp13/j$a;", "a", "Lmx/c;", "b", "Lh13/a;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<Params, p13.j.Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h13.a safetyGuideEndpoints;

    /* JADX INFO: renamed from: q13.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\u001e\u0010'R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010'R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b)\u0010'R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b(\u0010'R)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b+\u0010'¨\u0006/"}, d2 = {"Lq13/m$a;", "", "Lp13/i;", "state", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Lkotlin/Function1;", "", "openUrl", "Lr13/a;", "initializeMediaPlayer", "releaseMediaPlayer", "play", "pause", "Lkotlin/Function2;", "", "seekTo", "repeat", "<init>", "(Lp13/i;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/p;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp13/i;", "i", "()Lp13/i;", "b", "Ler/a;", "()Ler/a;", "c", "Ler/l;", "()Ler/l;", "d", "e", "f", "g", "h", "Ler/p;", "()Ler/p;", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f163775j = MediaPlayerState.f230171c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final State state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> openUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<r13.a, i0> initializeMediaPlayer;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<r13.a, i0> releaseMediaPlayer;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<r13.a, i0> play;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<r13.a, i0> pause;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final p<r13.a, Long, i0> seekTo;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<r13.a, i0> repeat;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(State state, er.a<i0> aVar, er.l<? super String, i0> lVar, er.l<? super r13.a, i0> lVar2, er.l<? super r13.a, i0> lVar3, er.l<? super r13.a, i0> lVar4, er.l<? super r13.a, i0> lVar5, p<? super r13.a, ? super Long, i0> pVar, er.l<? super r13.a, i0> lVar6) {
            this.state = state;
            this.onBackAction = aVar;
            this.openUrl = lVar;
            this.initializeMediaPlayer = lVar2;
            this.releaseMediaPlayer = lVar3;
            this.play = lVar4;
            this.pause = lVar5;
            this.seekTo = pVar;
            this.repeat = lVar6;
        }

        public final er.l<r13.a, i0> a() {
            return this.initializeMediaPlayer;
        }

        public final er.a<i0> b() {
            return this.onBackAction;
        }

        public final er.l<String, i0> c() {
            return this.openUrl;
        }

        public final er.l<r13.a, i0> d() {
            return this.pause;
        }

        public final er.l<r13.a, i0> e() {
            return this.play;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.onBackAction, params.onBackAction) && t.c(this.openUrl, params.openUrl) && t.c(this.initializeMediaPlayer, params.initializeMediaPlayer) && t.c(this.releaseMediaPlayer, params.releaseMediaPlayer) && t.c(this.play, params.play) && t.c(this.pause, params.pause) && t.c(this.seekTo, params.seekTo) && t.c(this.repeat, params.repeat);
        }

        public final er.l<r13.a, i0> f() {
            return this.releaseMediaPlayer;
        }

        public final er.l<r13.a, i0> g() {
            return this.repeat;
        }

        public final p<r13.a, Long, i0> h() {
            return this.seekTo;
        }

        public int hashCode() {
            return (((((((((((((((this.state.hashCode() * 31) + this.onBackAction.hashCode()) * 31) + this.openUrl.hashCode()) * 31) + this.initializeMediaPlayer.hashCode()) * 31) + this.releaseMediaPlayer.hashCode()) * 31) + this.play.hashCode()) * 31) + this.pause.hashCode()) * 31) + this.seekTo.hashCode()) * 31) + this.repeat.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final State getState() {
            return this.state;
        }

        public String toString() {
            return "Params(state=" + this.state + ", onBackAction=" + this.onBackAction + ", openUrl=" + this.openUrl + ", initializeMediaPlayer=" + this.initializeMediaPlayer + ", releaseMediaPlayer=" + this.releaseMediaPlayer + ", play=" + this.play + ", pause=" + this.pause + ", seekTo=" + this.seekTo + ", repeat=" + this.repeat + ')';
        }
    }

    public m(mx.c cVar, h13.a aVar) {
        this.labelProvider = cVar;
        this.safetyGuideEndpoints = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Params params, r13.a aVar) {
        params.e().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Params params, r13.a aVar) {
        params.d().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Params params, r13.a aVar) {
        params.g().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Params params, r13.a aVar, long j15) {
        params.h().B(aVar, Long.valueOf(j15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Params params, r13.a aVar) {
        params.f().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params, r13.a aVar) {
        params.a().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(Params params, r13.a aVar) {
        params.e().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(Params params, r13.a aVar) {
        params.d().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params, r13.a aVar) {
        params.g().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params, r13.a aVar, long j15) {
        params.h().B(aVar, Long.valueOf(j15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 O(Params params, r13.a aVar) {
        params.f().b(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, r13.a aVar) {
        params.a().b(aVar);
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public p13.j.Data b(final Params params) {
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(BaseScaffoldData.EnumC2111a.ExitUntilCollapsedScroll, new x50.i.Medium(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), params.b()), this.labelProvider.c(g13.c.f69759y), null, null, false, null, 60, null), null, null, null, null, 60, null);
        Label labelC = this.labelProvider.c(g13.c.f69726n);
        Label labelC2 = this.labelProvider.c(g13.c.f69723m);
        Label labelC3 = this.labelProvider.c(g13.c.f69756x);
        InfoRowListData infoRowListData = new InfoRowListData(v.q(new t40.a.C4874a(this.labelProvider.c(g13.c.f69741s)), new t40.a.C4874a(this.labelProvider.c(g13.c.f69747u)), new t40.a.C4874a(this.labelProvider.c(g13.c.f69753w)), new t40.a.C4874a(this.labelProvider.c(g13.c.f69744t)), new t40.a.C4874a(this.labelProvider.c(g13.c.f69738r)), new t40.a.C4874a(this.labelProvider.c(g13.c.f69750v))));
        c30.b.c cVar = new c30.b.c(null, null, this.labelProvider.c(g13.c.f69735q), this.labelProvider.c(g13.c.f69729o), null, null, new c30.a.Link(new LinkData("RSOAppLink", this.labelProvider.c(g13.c.f69732p), this.safetyGuideEndpoints.C(), LinkData.EnumC5775a.WEBSITE, false, params.c(), 16, null)), 51, null);
        Label labelC4 = this.labelProvider.c(g13.c.f69720l);
        Label labelC5 = this.labelProvider.c(g13.c.f69702f);
        Label labelC6 = this.labelProvider.c(g13.c.f69705g);
        Label labelC7 = this.labelProvider.c(g13.c.f69696d);
        Label labelC8 = this.labelProvider.c(g13.c.f69714j);
        Label labelC9 = this.labelProvider.c(g13.c.f69717k);
        Label labelC10 = this.labelProvider.c(g13.c.f69708h);
        final r13.a aVar = r13.a.ALARM_ANNOUNCEMENT;
        MediaPlayerComponentData mediaPlayerComponentData = new MediaPlayerComponentData(this.labelProvider.c(g13.c.f69699e), params.getState().getAlarmAnnouncementMediaPlayerState(), params.getState().getAlarmAnnouncementMediaPlayerCurrentPosition(), new er.a() { // from class: q13.a
            @Override // er.a
            public final Object a() {
                return m.z(params, aVar);
            }
        }, new er.a() { // from class: q13.f
            @Override // er.a
            public final Object a() {
                return m.E(params, aVar);
            }
        }, new er.a() { // from class: q13.g
            @Override // er.a
            public final Object a() {
                return m.F(params, aVar);
            }
        }, new er.a() { // from class: q13.h
            @Override // er.a
            public final Object a() {
                return m.G(params, aVar);
            }
        }, new er.l() { // from class: q13.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.H(params, aVar, ((Long) obj).longValue());
            }
        }, new er.a() { // from class: q13.j
            @Override // er.a
            public final Object a() {
                return m.I(params, aVar);
            }
        }, null);
        final r13.a aVar2 = r13.a.ALARM_CANCELLATION;
        return new p13.j.Data(baseScaffoldData, labelC, labelC2, labelC3, infoRowListData, cVar, labelC4, labelC5, labelC6, labelC7, labelC8, labelC9, labelC10, mediaPlayerComponentData, new MediaPlayerComponentData(this.labelProvider.c(g13.c.f69711i), params.getState().getAlarmCancellationMediaPlayerState(), params.getState().getAlarmCancellationMediaPlayerCurrentPosition(), new er.a() { // from class: q13.k
            @Override // er.a
            public final Object a() {
                return m.J(params, aVar2);
            }
        }, new er.a() { // from class: q13.l
            @Override // er.a
            public final Object a() {
                return m.K(params, aVar2);
            }
        }, new er.a() { // from class: q13.b
            @Override // er.a
            public final Object a() {
                return m.L(params, aVar2);
            }
        }, new er.a() { // from class: q13.c
            @Override // er.a
            public final Object a() {
                return m.M(params, aVar2);
            }
        }, new er.l() { // from class: q13.d
            @Override // er.l
            public final Object b(Object obj) {
                return m.N(params, aVar2, ((Long) obj).longValue());
            }
        }, new er.a() { // from class: q13.e
            @Override // er.a
            public final Object a() {
                return m.O(params, aVar2);
            }
        }, null));
    }
}
