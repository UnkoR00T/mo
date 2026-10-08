package p21;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lp21/d;", "", "Lp21/d$a;", "getData", "()Lp21/d$a;", "data", "a", "c", "b", "Lp21/d$b;", "Lp21/d$c;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: p21.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lp21/d$b;", "Lp21/d;", "Lp21/d$a;", "data", "Lcb4/i;", "vmsAdapter", "<init>", "(Lp21/d$a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp21/d$a;", "getData", "()Lp21/d$a;", "b", "Lcb4/i;", "()Lcb4/i;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i vmsAdapter;

        public Dialog(Data data, cb4.i iVar) {
            this.data = data;
            this.vmsAdapter = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final cb4.i getVmsAdapter() {
            return this.vmsAdapter;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dialog)) {
                return false;
            }
            Dialog dialog = (Dialog) other;
            return fr.t.c(this.data, dialog.data) && fr.t.c(this.vmsAdapter, dialog.vmsAdapter);
        }

        @Override // p21.d
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.vmsAdapter.hashCode();
        }

        public String toString() {
            return "Dialog(data=" + this.data + ", vmsAdapter=" + this.vmsAdapter + ')';
        }
    }

    /* JADX INFO: renamed from: p21.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lp21/d$c;", "Lp21/d;", "Lp21/d$a;", "data", "<init>", "(Lp21/d$a;)V", "a", "(Lp21/d$a;)Lp21/d$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lp21/d$a;", "getData", "()Lp21/d$a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screen implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f151799b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Data data;

        public Screen(Data data) {
            this.data = data;
        }

        public final Screen a(Data data) {
            return new Screen(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screen) && fr.t.c(this.data, ((Screen) other).data);
        }

        @Override // p21.d
        public Data getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Screen(data=" + this.data + ')';
        }
    }

    Data getData();

    /* JADX INFO: renamed from: p21.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010#\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lp21/d$a;", "", "Liy/b0;", "conversationId", "", "description", "", "charsLimitReached", "Lg21/f;", "ratingScale", "<init>", "(Liy/b0;Ljava/lang/String;ZLg21/f;)V", "a", "(Liy/b0;Ljava/lang/String;ZLg21/f;)Lp21/d$a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "d", "()Liy/b0;", "b", "Ljava/lang/String;", "e", "c", "Z", "()Z", "Lg21/f;", "f", "()Lg21/f;", "g", "isAnyDataEntered", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f151792e = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 conversationId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean charsLimitReached;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final g21.f ratingScale;

        public Data(iy.b0 b0Var, String str, boolean z15, g21.f fVar) {
            this.conversationId = b0Var;
            this.description = str;
            this.charsLimitReached = z15;
            this.ratingScale = fVar;
        }

        public static /* synthetic */ Data b(Data data, iy.b0 b0Var, String str, boolean z15, g21.f fVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = data.conversationId;
            }
            if ((i15 & 2) != 0) {
                str = data.description;
            }
            if ((i15 & 4) != 0) {
                z15 = data.charsLimitReached;
            }
            if ((i15 & 8) != 0) {
                fVar = data.ratingScale;
            }
            return data.a(b0Var, str, z15, fVar);
        }

        public final Data a(iy.b0 conversationId, String description, boolean charsLimitReached, g21.f ratingScale) {
            return new Data(conversationId, description, charsLimitReached, ratingScale);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCharsLimitReached() {
            return this.charsLimitReached;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getConversationId() {
            return this.conversationId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.conversationId, data.conversationId) && fr.t.c(this.description, data.description) && this.charsLimitReached == data.charsLimitReached && fr.t.c(this.ratingScale, data.ratingScale);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final g21.f getRatingScale() {
            return this.ratingScale;
        }

        public final boolean g() {
            return !fu.r.t0(this.description) || (this.ratingScale instanceof g21.f.Selected);
        }

        public int hashCode() {
            return (((((this.conversationId.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.charsLimitReached)) * 31) + this.ratingScale.hashCode();
        }

        public String toString() {
            return "Data(conversationId=" + this.conversationId + ", description=" + this.description + ", charsLimitReached=" + this.charsLimitReached + ", ratingScale=" + this.ratingScale + ')';
        }

        public /* synthetic */ Data(iy.b0 b0Var, String str, boolean z15, g21.f fVar, int i15, fr.k kVar) {
            this(b0Var, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? false : z15, (i15 & 8) != 0 ? g21.f.a.f69820a : fVar);
        }
    }
}
