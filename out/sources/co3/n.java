package co3;

import do3.RailwayCardMemberData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\t\u0010\u000b\u0011\r\u0012B'\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0006\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lco3/n;", "", "", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Z", "()Z", "e", "f", "d", "Lco3/n$a;", "Lco3/n$b;", "Lco3/n$c;", "Lco3/n$d;", "Lco3/n$e;", "Lco3/n$f;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String body;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isOwner;

    /* JADX INFO: renamed from: co3.n$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lco3/n$b;", "Lco3/n;", "", "id", "Lwn3/a;", "subtype", "", "isOwner", "<init>", "(Ljava/lang/String;Lwn3/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "getId", "e", "Lwn3/a;", "()Lwn3/a;", "f", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DrivingLicenceDocument extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.a subtype;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOwner;

        public /* synthetic */ DrivingLicenceDocument(String str, wn3.a aVar, boolean z15, int i15, fr.k kVar) {
            this(str, aVar, (i15 & 4) != 0 ? true : z15);
        }

        @Override // co3.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsOwner() {
            return this.isOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final wn3.a getSubtype() {
            return this.subtype;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrivingLicenceDocument)) {
                return false;
            }
            DrivingLicenceDocument drivingLicenceDocument = (DrivingLicenceDocument) other;
            return fr.t.c(this.id, drivingLicenceDocument.id) && this.subtype == drivingLicenceDocument.subtype && this.isOwner == drivingLicenceDocument.isOwner;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.subtype.hashCode()) * 31) + Boolean.hashCode(this.isOwner);
        }

        public String toString() {
            return "DrivingLicenceDocument(id=" + this.id + ", subtype=" + this.subtype + ", isOwner=" + this.isOwner + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DrivingLicenceDocument(String str, wn3.a aVar, boolean z15) {
            super("", null, z15, 0 == true ? 1 : 0);
            this.id = str;
            this.subtype = aVar;
            this.isOwner = z15;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\n\r\u0013B-\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lco3/n$d;", "Lco3/n;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "b", "f", "a", "g", "Z", "c", "()Z", "Lco3/n$d$a;", "Lco3/n$d$b;", "Lco3/n$d$c;", "Lco3/n$d$d;", "Lco3/n$d$e;", "Lco3/n$d$f;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class d extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String body;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final boolean isOwner;

        /* JADX INFO: renamed from: co3.n$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lco3/n$d$a;", "Lco3/n$d;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "d", "i", "b", "j", "a", "k", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BailiffCard extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String body;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOwner;

            public BailiffCard(String str, String str2, String str3, boolean z15) {
                super(str, str2, str3, z15, null);
                this.id = str;
                this.name = str2;
                this.body = str3;
                this.isOwner = z15;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBody() {
                return this.body;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getName() {
                return this.name;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getIsOwner() {
                return this.isOwner;
            }

            @Override // co3.n.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof BailiffCard)) {
                    return false;
                }
                BailiffCard bailiffCard = (BailiffCard) other;
                return fr.t.c(this.id, bailiffCard.id) && fr.t.c(this.name, bailiffCard.name) && fr.t.c(this.body, bailiffCard.body) && this.isOwner == bailiffCard.isOwner;
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.body;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isOwner);
            }

            public String toString() {
                return "BailiffCard(id=" + this.id + ", name=" + this.name + ", body=" + this.body + ", isOwner=" + this.isOwner + ')';
            }
        }

        /* JADX INFO: renamed from: co3.n$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lco3/n$d$b;", "Lco3/n$d;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "d", "i", "b", "j", "a", "k", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisabledPersonIdentificationCard extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String body;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOwner;

            public DisabledPersonIdentificationCard(String str, String str2, String str3, boolean z15) {
                super(str, str2, str3, z15, null);
                this.id = str;
                this.name = str2;
                this.body = str3;
                this.isOwner = z15;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBody() {
                return this.body;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getName() {
                return this.name;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getIsOwner() {
                return this.isOwner;
            }

            @Override // co3.n.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisabledPersonIdentificationCard)) {
                    return false;
                }
                DisabledPersonIdentificationCard disabledPersonIdentificationCard = (DisabledPersonIdentificationCard) other;
                return fr.t.c(this.id, disabledPersonIdentificationCard.id) && fr.t.c(this.name, disabledPersonIdentificationCard.name) && fr.t.c(this.body, disabledPersonIdentificationCard.body) && this.isOwner == disabledPersonIdentificationCard.isOwner;
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.body;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isOwner);
            }

            public String toString() {
                return "DisabledPersonIdentificationCard(id=" + this.id + ", name=" + this.name + ", body=" + this.body + ", isOwner=" + this.isOwner + ')';
            }
        }

        /* JADX INFO: renamed from: co3.n$d$c, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lco3/n$d$c;", "Lco3/n$d;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "d", "i", "b", "j", "a", "k", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ElectronicDiplomaDsc extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String body;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOwner;

            public ElectronicDiplomaDsc(String str, String str2, String str3, boolean z15) {
                super(str, str2, str3, z15, null);
                this.id = str;
                this.name = str2;
                this.body = str3;
                this.isOwner = z15;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBody() {
                return this.body;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getName() {
                return this.name;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getIsOwner() {
                return this.isOwner;
            }

            @Override // co3.n.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ElectronicDiplomaDsc)) {
                    return false;
                }
                ElectronicDiplomaDsc electronicDiplomaDsc = (ElectronicDiplomaDsc) other;
                return fr.t.c(this.id, electronicDiplomaDsc.id) && fr.t.c(this.name, electronicDiplomaDsc.name) && fr.t.c(this.body, electronicDiplomaDsc.body) && this.isOwner == electronicDiplomaDsc.isOwner;
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.body;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isOwner);
            }

            public String toString() {
                return "ElectronicDiplomaDsc(id=" + this.id + ", name=" + this.name + ", body=" + this.body + ", isOwner=" + this.isOwner + ')';
            }
        }

        /* JADX INFO: renamed from: co3.n$d$d, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lco3/n$d$d;", "Lco3/n$d;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "d", "i", "b", "j", "a", "k", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ElectronicDiplomaGraduation extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String body;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOwner;

            public ElectronicDiplomaGraduation(String str, String str2, String str3, boolean z15) {
                super(str, str2, str3, z15, null);
                this.id = str;
                this.name = str2;
                this.body = str3;
                this.isOwner = z15;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBody() {
                return this.body;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getName() {
                return this.name;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getIsOwner() {
                return this.isOwner;
            }

            @Override // co3.n.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ElectronicDiplomaGraduation)) {
                    return false;
                }
                ElectronicDiplomaGraduation electronicDiplomaGraduation = (ElectronicDiplomaGraduation) other;
                return fr.t.c(this.id, electronicDiplomaGraduation.id) && fr.t.c(this.name, electronicDiplomaGraduation.name) && fr.t.c(this.body, electronicDiplomaGraduation.body) && this.isOwner == electronicDiplomaGraduation.isOwner;
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.body;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isOwner);
            }

            public String toString() {
                return "ElectronicDiplomaGraduation(id=" + this.id + ", name=" + this.name + ", body=" + this.body + ", isOwner=" + this.isOwner + ')';
            }
        }

        /* JADX INFO: renamed from: co3.n$d$e, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lco3/n$d$e;", "Lco3/n$d;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "d", "i", "b", "j", "a", "k", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ElectronicDiplomaPhd extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String body;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOwner;

            public ElectronicDiplomaPhd(String str, String str2, String str3, boolean z15) {
                super(str, str2, str3, z15, null);
                this.id = str;
                this.name = str2;
                this.body = str3;
                this.isOwner = z15;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBody() {
                return this.body;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getName() {
                return this.name;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getIsOwner() {
                return this.isOwner;
            }

            @Override // co3.n.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ElectronicDiplomaPhd)) {
                    return false;
                }
                ElectronicDiplomaPhd electronicDiplomaPhd = (ElectronicDiplomaPhd) other;
                return fr.t.c(this.id, electronicDiplomaPhd.id) && fr.t.c(this.name, electronicDiplomaPhd.name) && fr.t.c(this.body, electronicDiplomaPhd.body) && this.isOwner == electronicDiplomaPhd.isOwner;
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.body;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isOwner);
            }

            public String toString() {
                return "ElectronicDiplomaPhd(id=" + this.id + ", name=" + this.name + ", body=" + this.body + ", isOwner=" + this.isOwner + ')';
            }
        }

        /* JADX INFO: renamed from: co3.n$d$f, reason: from toString */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lco3/n$d$f;", "Lco3/n$d;", "", "id", "name", "body", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "h", "Ljava/lang/String;", "d", "i", "b", "j", "a", "k", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TeacherCard extends d {

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String id;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String name;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final String body;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isOwner;

            public TeacherCard(String str, String str2, String str3, boolean z15) {
                super(str, str2, str3, z15, null);
                this.id = str;
                this.name = str2;
                this.body = str3;
                this.isOwner = z15;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: a, reason: from getter */
            public String getBody() {
                return this.body;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: b, reason: from getter */
            public String getName() {
                return this.name;
            }

            @Override // co3.n.d, co3.n
            /* JADX INFO: renamed from: c, reason: from getter */
            public boolean getIsOwner() {
                return this.isOwner;
            }

            @Override // co3.n.d
            /* JADX INFO: renamed from: d, reason: from getter */
            public String getId() {
                return this.id;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TeacherCard)) {
                    return false;
                }
                TeacherCard teacherCard = (TeacherCard) other;
                return fr.t.c(this.id, teacherCard.id) && fr.t.c(this.name, teacherCard.name) && fr.t.c(this.body, teacherCard.body) && this.isOwner == teacherCard.isOwner;
            }

            public int hashCode() {
                int iHashCode = ((this.id.hashCode() * 31) + this.name.hashCode()) * 31;
                String str = this.body;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isOwner);
            }

            public String toString() {
                return "TeacherCard(id=" + this.id + ", name=" + this.name + ", body=" + this.body + ", isOwner=" + this.isOwner + ')';
            }
        }

        public /* synthetic */ d(String str, String str2, String str3, boolean z15, fr.k kVar) {
            this(str, str2, str3, z15);
        }

        @Override // co3.n
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getBody() {
            return this.body;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsOwner() {
            return this.isOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public String getId() {
            return this.id;
        }

        private d(String str, String str2, String str3, boolean z15) {
            super(str2, null, z15, 2, null);
            this.id = str;
            this.name = str2;
            this.body = str3;
            this.isOwner = z15;
        }
    }

    /* JADX INFO: renamed from: co3.n$e, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lco3/n$e;", "Lco3/n;", "", "id", "", "isParent", "name", "isOwner", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "Z", "()Z", "f", "b", "g", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KdrDocument extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isParent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOwner;

        public KdrDocument(String str, boolean z15, String str2, boolean z16) {
            super(str2, null, z16, 2, null);
            this.id = str;
            this.isParent = z15;
            this.name = str2;
            this.isOwner = z16;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsOwner() {
            return this.isOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsParent() {
            return this.isParent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KdrDocument)) {
                return false;
            }
            KdrDocument kdrDocument = (KdrDocument) other;
            return fr.t.c(this.id, kdrDocument.id) && this.isParent == kdrDocument.isParent && fr.t.c(this.name, kdrDocument.name) && this.isOwner == kdrDocument.isOwner;
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + Boolean.hashCode(this.isParent)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isOwner);
        }

        public String toString() {
            return "KdrDocument(id=" + this.id + ", isParent=" + this.isParent + ", name=" + this.name + ", isOwner=" + this.isOwner + ')';
        }
    }

    /* JADX INFO: renamed from: co3.n$f, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lco3/n$f;", "Lco3/n;", "", "id", "Ldo3/d$a;", "category", "", "isFamily", "name", "isOwner", "<init>", "(Ljava/lang/String;Ldo3/d$a;ZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "Ldo3/d$a;", "()Ldo3/d$a;", "f", "Z", "()Z", "g", "b", "h", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RailwayDocument extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardMemberData.a category;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFamily;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOwner;

        public RailwayDocument(String str, RailwayCardMemberData.a aVar, boolean z15, String str2, boolean z16) {
            super(str2, null, z16, 2, null);
            this.id = str;
            this.category = aVar;
            this.isFamily = z15;
            this.name = str2;
            this.isOwner = z16;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsOwner() {
            return this.isOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final RailwayCardMemberData.a getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RailwayDocument)) {
                return false;
            }
            RailwayDocument railwayDocument = (RailwayDocument) other;
            return fr.t.c(this.id, railwayDocument.id) && this.category == railwayDocument.category && this.isFamily == railwayDocument.isFamily && fr.t.c(this.name, railwayDocument.name) && this.isOwner == railwayDocument.isOwner;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getIsFamily() {
            return this.isFamily;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.category.hashCode()) * 31) + Boolean.hashCode(this.isFamily)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isOwner);
        }

        public String toString() {
            return "RailwayDocument(id=" + this.id + ", category=" + this.category + ", isFamily=" + this.isFamily + ", name=" + this.name + ", isOwner=" + this.isOwner + ')';
        }
    }

    public /* synthetic */ n(String str, String str2, boolean z15, fr.k kVar) {
        this(str, str2, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public boolean getIsOwner() {
        return this.isOwner;
    }

    private n(String str, String str2, boolean z15) {
        this.name = str;
        this.body = str2;
        this.isOwner = z15;
    }

    /* JADX INFO: renamed from: co3.n$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lco3/n$a;", "Lco3/n;", "", "id", "name", "", "isOwner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "b", "f", "Z", "c", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiiaDocument extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOwner;

        public DiiaDocument(String str, String str2, boolean z15) {
            super(str2, null, z15, 2, null);
            this.id = str;
            this.name = str2;
            this.isOwner = z15;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsOwner() {
            return this.isOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DiiaDocument)) {
                return false;
            }
            DiiaDocument diiaDocument = (DiiaDocument) other;
            return fr.t.c(this.id, diiaDocument.id) && fr.t.c(this.name, diiaDocument.name) && this.isOwner == diiaDocument.isOwner;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isOwner);
        }

        public String toString() {
            return "DiiaDocument(id=" + this.id + ", name=" + this.name + ", isOwner=" + this.isOwner + ')';
        }

        public /* synthetic */ DiiaDocument(String str, String str2, boolean z15, int i15, fr.k kVar) {
            this(str, str2, (i15 & 4) != 0 ? false : z15);
        }
    }

    /* JADX INFO: renamed from: co3.n$c, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lco3/n$c;", "Lco3/n;", "", "id", "", "hasPicture", "name", "isOwner", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "Z", "()Z", "f", "b", "g", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DynamicDocument extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPicture;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOwner;

        public DynamicDocument(String str, boolean z15, String str2, boolean z16) {
            super(str2, null, z16, 2, null);
            this.id = str;
            this.hasPicture = z15;
            this.name = str2;
            this.isOwner = z16;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // co3.n
        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getIsOwner() {
            return this.isOwner;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getHasPicture() {
            return this.hasPicture;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DynamicDocument)) {
                return false;
            }
            DynamicDocument dynamicDocument = (DynamicDocument) other;
            return fr.t.c(this.id, dynamicDocument.id) && this.hasPicture == dynamicDocument.hasPicture && fr.t.c(this.name, dynamicDocument.name) && this.isOwner == dynamicDocument.isOwner;
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + Boolean.hashCode(this.hasPicture)) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isOwner);
        }

        public String toString() {
            return "DynamicDocument(id=" + this.id + ", hasPicture=" + this.hasPicture + ", name=" + this.name + ", isOwner=" + this.isOwner + ')';
        }

        public /* synthetic */ DynamicDocument(String str, boolean z15, String str2, boolean z16, int i15, fr.k kVar) {
            this(str, z15, str2, (i15 & 8) != 0 ? true : z16);
        }
    }

    public /* synthetic */ n(String str, String str2, boolean z15, int i15, fr.k kVar) {
        this(str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? false : z15, null);
    }
}
