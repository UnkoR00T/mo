package ah1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lah1/a;", "", "", "getTitle", "()I", "title", "getIcon", "icon", "b", "a", "c", "Lah1/a$a;", "Lah1/a$b;", "Lah1/a$c;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: ah1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lah1/a$a;", "Lah1/a;", "", "", "title", "icon", "<init>", "(Ljava/lang/String;III)V", "a", "I", "getTitle", "()I", "b", "getIcon", "c", "d", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC0131a implements a {
        EDOR(sg1.a.A, jz.a.V0),
        NOTIFICATIONS(sg1.a.H, jz.a.f106736b0);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f6307f = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int icon;

        EnumC0131a(int i15, int i16) {
            this.title = i15;
            this.icon = i16;
        }

        public static wq.a<EnumC0131a> e() {
            return f6307f;
        }

        @Override // ah1.a
        public int getIcon() {
            return this.icon;
        }

        @Override // ah1.a
        public int getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, d2 = {"Lah1/a$b;", "Lah1/a;", "", "", "title", "icon", "<init>", "(Ljava/lang/String;III)V", "a", "I", "getTitle", "()I", "b", "getIcon", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b implements a {
        CONTACT_DETAILS(sg1.a.X1, jz.a.f106881v),
        REGISTERED_ADDRESS(sg1.a.f181450a2, jz.a.f106729a1),
        PASSPORT_DETAILS(sg1.a.Z1, jz.a.E0),
        CHANGE_PASSWORD(sg1.a.W1, jz.a.f106767f),
        BIOMETRIC_LOGIN(sg1.a.V1, jz.a.f106775g),
        NOTIFICATIONS(sg1.a.Y1, jz.a.f106736b0),
        APPEARANCE(sg1.a.K1, jz.a.M),
        LANGUAGE(sg1.a.J1, jz.a.Z0),
        CERTIFICATES_ISSUED(sg1.a.f181509q0, jz.a.J0),
        HISTORY(sg1.a.f181515s0, jz.a.f106797j),
        ABOUT_APP(sg1.a.I1, jz.a.H1),
        TECHNICAL_SUPPORT(sg1.a.f181518t0, jz.a.f106752d0),
        APP_RATING(sg1.a.f181506p0, jz.a.f106846q),
        CHAT_BOT(sg1.a.f181512r0, jz.a.S0),
        VOTE_IDEA(sg1.a.f181498m2, jz.a.W0),
        DEACTIVATE_APP(sg1.a.Q1, jz.a.f106860s),
        LOGOUT(sg1.a.C, jz.a.f106784h0);


        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final /* synthetic */ wq.a f6328x = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int icon;

        b(int i15, int i16) {
            this.title = i15;
            this.icon = i16;
        }

        public static wq.a<b> e() {
            return f6328x;
        }

        @Override // ah1.a
        public int getIcon() {
            return this.icon;
        }

        @Override // ah1.a
        public int getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lah1/a$c;", "Lah1/a;", "", "", "title", "icon", "<init>", "(Ljava/lang/String;III)V", "a", "I", "getTitle", "()I", "b", "getIcon", "c", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum c implements a {
        VERIFIER(sg1.a.T, jz.a.D4);


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f6333e = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int icon;

        c(int i15, int i16) {
            this.title = i15;
            this.icon = i16;
        }

        public static wq.a<c> e() {
            return f6333e;
        }

        @Override // ah1.a
        public int getIcon() {
            return this.icon;
        }

        @Override // ah1.a
        public int getTitle() {
            return this.title;
        }
    }

    int getIcon();

    int getTitle();
}
