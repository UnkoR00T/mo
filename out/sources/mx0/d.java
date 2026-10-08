package mx0;

import java.util.Map;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import p071kotlin.Metadata;
import th0.AppActivationChallengeWithBeKeys;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lmx0/d;", "", "c", "a", "b", "Lmx0/d$a;", "Lmx0/d$b;", "Lmx0/d$c;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\b\u000bB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0004\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lmx0/d$a;", "Lmx0/d;", "Lrq0/b;", "mainDocumentType", "", "showTakesTooLong", "<init>", "(Lrq0/b;Z)V", "a", "Lrq0/b;", "()Lrq0/b;", "b", "Z", "()Z", "c", "d", "Lmx0/d$a$a;", "Lmx0/d$a$b;", "Lmx0/d$a$c;", "Lmx0/d$a$d;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final rq0.b mainDocumentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean showTakesTooLong;

        /* JADX INFO: renamed from: mx0.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmx0/d$a$a;", "Lmx0/d$a;", "Lrq0/b;", "mainDocumentType", "Liy/b0;", "challenge", "<init>", "(Lrq0/b;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lrq0/b;", "a", "()Lrq0/b;", "d", "Liy/b0;", "()Liy/b0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActivateApp extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b mainDocumentType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 challenge;

            public ActivateApp(rq0.b bVar, iy.b0 b0Var) {
                super(bVar, false, 2, null);
                this.mainDocumentType = bVar;
                this.challenge = b0Var;
            }

            @Override // mx0.d.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public rq0.b getMainDocumentType() {
                return this.mainDocumentType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final iy.b0 getChallenge() {
                return this.challenge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActivateApp)) {
                    return false;
                }
                ActivateApp activateApp = (ActivateApp) other;
                return fr.t.c(this.mainDocumentType, activateApp.mainDocumentType) && fr.t.c(this.challenge, activateApp.challenge);
            }

            public int hashCode() {
                return (this.mainDocumentType.hashCode() * 31) + this.challenge.hashCode();
            }

            public String toString() {
                return "ActivateApp(mainDocumentType=" + this.mainDocumentType + ", challenge=" + this.challenge + ')';
            }
        }

        /* JADX INFO: renamed from: mx0.d$a$c, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmx0/d$a$c;", "Lmx0/d$a;", "Lrq0/b;", "mainDocumentType", "Liy/b0;", "activationContent", "<init>", "(Lrq0/b;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lrq0/b;", "a", "()Lrq0/b;", "d", "Liy/b0;", "()Liy/b0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GenerateActivationChallenge extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b mainDocumentType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 activationContent;

            public GenerateActivationChallenge(rq0.b bVar, iy.b0 b0Var) {
                super(bVar, false, 2, null);
                this.mainDocumentType = bVar;
                this.activationContent = b0Var;
            }

            @Override // mx0.d.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public rq0.b getMainDocumentType() {
                return this.mainDocumentType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final iy.b0 getActivationContent() {
                return this.activationContent;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GenerateActivationChallenge)) {
                    return false;
                }
                GenerateActivationChallenge generateActivationChallenge = (GenerateActivationChallenge) other;
                return fr.t.c(this.mainDocumentType, generateActivationChallenge.mainDocumentType) && fr.t.c(this.activationContent, generateActivationChallenge.activationContent);
            }

            public int hashCode() {
                return (this.mainDocumentType.hashCode() * 31) + this.activationContent.hashCode();
            }

            public String toString() {
                return "GenerateActivationChallenge(mainDocumentType=" + this.mainDocumentType + ", activationContent=" + this.activationContent + ')';
            }
        }

        /* JADX INFO: renamed from: mx0.d$a$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmx0/d$a$d;", "Lmx0/d$a;", "Lrq0/b;", "mainDocumentType", "Lth0/b;", "activationChallenge", "<init>", "(Lrq0/b;Lth0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lrq0/b;", "a", "()Lrq0/b;", "d", "Lth0/b;", "()Lth0/b;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StartCertActivation extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b mainDocumentType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final AppActivationChallengeWithBeKeys activationChallenge;

            public StartCertActivation(rq0.b bVar, AppActivationChallengeWithBeKeys appActivationChallengeWithBeKeys) {
                super(bVar, false, 2, null);
                this.mainDocumentType = bVar;
                this.activationChallenge = appActivationChallengeWithBeKeys;
            }

            @Override // mx0.d.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public rq0.b getMainDocumentType() {
                return this.mainDocumentType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final AppActivationChallengeWithBeKeys getActivationChallenge() {
                return this.activationChallenge;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StartCertActivation)) {
                    return false;
                }
                StartCertActivation startCertActivation = (StartCertActivation) other;
                return fr.t.c(this.mainDocumentType, startCertActivation.mainDocumentType) && fr.t.c(this.activationChallenge, startCertActivation.activationChallenge);
            }

            public int hashCode() {
                return (this.mainDocumentType.hashCode() * 31) + this.activationChallenge.hashCode();
            }

            public String toString() {
                return "StartCertActivation(mainDocumentType=" + this.mainDocumentType + ", activationChallenge=" + this.activationChallenge + ')';
            }
        }

        public /* synthetic */ a(rq0.b bVar, boolean z15, fr.k kVar) {
            this(bVar, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public rq0.b getMainDocumentType() {
            return this.mainDocumentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getShowTakesTooLong() {
            return this.showTakesTooLong;
        }

        private a(rq0.b bVar, boolean z15) {
            this.mainDocumentType = bVar;
            this.showTakesTooLong = z15;
        }

        public /* synthetic */ a(rq0.b bVar, boolean z15, int i15, fr.k kVar) {
            this(bVar, (i15 & 2) != 0 ? false : z15, null);
        }

        /* JADX INFO: renamed from: mx0.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jf\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b$\u0010,R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b-\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b*\u0010/¨\u00060"}, d2 = {"Lmx0/d$a$b;", "Lmx0/d$a;", "Lrq0/b;", "mainDocumentType", "", "showTakesTooLong", "", "taskId", "Llz3/i;", "downloadTaskData", "", "Llz3/k;", "documentsToDownload", "terminated", "Liy/b0;", "mainDocumentAuthToken", "<init>", "(Lrq0/b;ZLjava/lang/String;Llz3/i;Ljava/util/Map;ZLiy/b0;)V", "c", "(Lrq0/b;ZLjava/lang/String;Llz3/i;Ljava/util/Map;ZLiy/b0;)Lmx0/d$a$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lrq0/b;", "a", "()Lrq0/b;", "d", "Z", "b", "()Z", "e", "Ljava/lang/String;", "h", "f", "Llz3/i;", "()Llz3/i;", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "i", "Liy/b0;", "()Liy/b0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AsyncDataDownload extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final rq0.b mainDocumentType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean showTakesTooLong;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String taskId;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final DownloadTaskData downloadTaskData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<rq0.b, TaskIncludedDocumentData> documentsToDownload;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean terminated;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final iy.b0 mainDocumentAuthToken;

            public AsyncDataDownload(rq0.b bVar, boolean z15, String str, DownloadTaskData downloadTaskData, Map<rq0.b, TaskIncludedDocumentData> map, boolean z16, iy.b0 b0Var) {
                super(bVar, z15, null);
                this.mainDocumentType = bVar;
                this.showTakesTooLong = z15;
                this.taskId = str;
                this.downloadTaskData = downloadTaskData;
                this.documentsToDownload = map;
                this.terminated = z16;
                this.mainDocumentAuthToken = b0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ AsyncDataDownload d(AsyncDataDownload asyncDataDownload, rq0.b bVar, boolean z15, String str, DownloadTaskData downloadTaskData, Map map, boolean z16, iy.b0 b0Var, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    bVar = asyncDataDownload.mainDocumentType;
                }
                if ((i15 & 2) != 0) {
                    z15 = asyncDataDownload.showTakesTooLong;
                }
                if ((i15 & 4) != 0) {
                    str = asyncDataDownload.taskId;
                }
                if ((i15 & 8) != 0) {
                    downloadTaskData = asyncDataDownload.downloadTaskData;
                }
                if ((i15 & 16) != 0) {
                    map = asyncDataDownload.documentsToDownload;
                }
                if ((i15 & 32) != 0) {
                    z16 = asyncDataDownload.terminated;
                }
                if ((i15 & 64) != 0) {
                    b0Var = asyncDataDownload.mainDocumentAuthToken;
                }
                boolean z17 = z16;
                iy.b0 b0Var2 = b0Var;
                Map map2 = map;
                String str2 = str;
                return asyncDataDownload.c(bVar, z15, str2, downloadTaskData, map2, z17, b0Var2);
            }

            @Override // mx0.d.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public rq0.b getMainDocumentType() {
                return this.mainDocumentType;
            }

            @Override // mx0.d.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getShowTakesTooLong() {
                return this.showTakesTooLong;
            }

            public final AsyncDataDownload c(rq0.b mainDocumentType, boolean showTakesTooLong, String taskId, DownloadTaskData downloadTaskData, Map<rq0.b, TaskIncludedDocumentData> documentsToDownload, boolean terminated, iy.b0 mainDocumentAuthToken) {
                return new AsyncDataDownload(mainDocumentType, showTakesTooLong, taskId, downloadTaskData, documentsToDownload, terminated, mainDocumentAuthToken);
            }

            public final Map<rq0.b, TaskIncludedDocumentData> e() {
                return this.documentsToDownload;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AsyncDataDownload)) {
                    return false;
                }
                AsyncDataDownload asyncDataDownload = (AsyncDataDownload) other;
                return fr.t.c(this.mainDocumentType, asyncDataDownload.mainDocumentType) && this.showTakesTooLong == asyncDataDownload.showTakesTooLong && fr.t.c(this.taskId, asyncDataDownload.taskId) && fr.t.c(this.downloadTaskData, asyncDataDownload.downloadTaskData) && fr.t.c(this.documentsToDownload, asyncDataDownload.documentsToDownload) && this.terminated == asyncDataDownload.terminated && fr.t.c(this.mainDocumentAuthToken, asyncDataDownload.mainDocumentAuthToken);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final DownloadTaskData getDownloadTaskData() {
                return this.downloadTaskData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final iy.b0 getMainDocumentAuthToken() {
                return this.mainDocumentAuthToken;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getTaskId() {
                return this.taskId;
            }

            public int hashCode() {
                int iHashCode = ((((this.mainDocumentType.hashCode() * 31) + Boolean.hashCode(this.showTakesTooLong)) * 31) + this.taskId.hashCode()) * 31;
                DownloadTaskData downloadTaskData = this.downloadTaskData;
                int iHashCode2 = (((((iHashCode + (downloadTaskData == null ? 0 : downloadTaskData.hashCode())) * 31) + this.documentsToDownload.hashCode()) * 31) + Boolean.hashCode(this.terminated)) * 31;
                iy.b0 b0Var = this.mainDocumentAuthToken;
                return iHashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final boolean getTerminated() {
                return this.terminated;
            }

            public String toString() {
                return "AsyncDataDownload(mainDocumentType=" + this.mainDocumentType + ", showTakesTooLong=" + this.showTakesTooLong + ", taskId=" + this.taskId + ", downloadTaskData=" + this.downloadTaskData + ", documentsToDownload=" + this.documentsToDownload + ", terminated=" + this.terminated + ", mainDocumentAuthToken=" + this.mainDocumentAuthToken + ')';
            }

            public /* synthetic */ AsyncDataDownload(rq0.b bVar, boolean z15, String str, DownloadTaskData downloadTaskData, Map map, boolean z16, iy.b0 b0Var, int i15, fr.k kVar) {
                this(bVar, (i15 & 2) != 0 ? false : z15, str, downloadTaskData, map, (i15 & 32) != 0 ? false : z16, b0Var);
            }
        }
    }

    /* JADX INFO: renamed from: mx0.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmx0/d$b;", "Lmx0/d;", "Lrq0/b;", "mainDocumentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "()Lrq0/b;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failure implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b mainDocumentType;

        public Failure(rq0.b bVar) {
            this.mainDocumentType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b getMainDocumentType() {
            return this.mainDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && fr.t.c(this.mainDocumentType, ((Failure) other).mainDocumentType);
        }

        public int hashCode() {
            return this.mainDocumentType.hashCode();
        }

        public String toString() {
            return "Failure(mainDocumentType=" + this.mainDocumentType + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmx0/d$c;", "Lmx0/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f129002a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1495518166;
        }

        public String toString() {
            return "Initial";
        }
    }
}
