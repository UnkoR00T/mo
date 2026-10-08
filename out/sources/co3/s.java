package co3;

import jr0.DrivingLicenceScope;
import jr0.NipipScope;
import jr0.PersonalDataScope8;
import k34.AdvocateDataModel;
import k34.DeputyCardModel;
import k34.FamilyDataModel;
import k34.JuniorSchoolCardData;
import k34.PensionerCardDocumentData;
import k34.RailwayCardDocumentData;
import k34.StudentCardDocumentData;
import k34.WruDocumentData;
import l34.DynamicDocumentVerification;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\f\r\u000e\u000f\u0010\u0011\u0012\n\u0007\u0013\u0014\u0015\u0016B\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\t\u0082\u0001\r\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lco3/s;", "", "", "picture", "verificationDateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getVerificationDateTime", "h", "g", "l", "c", "d", "i", "j", "f", "k", "m", "e", "Lco3/s$a;", "Lco3/s$b;", "Lco3/s$c;", "Lco3/s$d;", "Lco3/s$e;", "Lco3/s$f;", "Lco3/s$g;", "Lco3/s$h;", "Lco3/s$i;", "Lco3/s$j;", "Lco3/s$k;", "Lco3/s$l;", "Lco3/s$m;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String picture;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String verificationDateTime;

    /* JADX INFO: renamed from: co3.s$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$a;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/b;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/b;", "b", "()Lk34/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdvocateData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AdvocateDataModel data;

        public AdvocateData(String str, String str2, AdvocateDataModel advocateDataModel) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = advocateDataModel;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final AdvocateDataModel getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvocateData)) {
                return false;
            }
            AdvocateData advocateData = (AdvocateData) other;
            return fr.t.c(this.picture, advocateData.picture) && fr.t.c(this.verificationDateTime, advocateData.verificationDateTime) && fr.t.c(this.data, advocateData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "AdvocateData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$b;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/e;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/e;", "b", "()Lk34/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeputyData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DeputyCardModel data;

        public DeputyData(String str, String str2, DeputyCardModel deputyCardModel) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = deputyCardModel;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DeputyCardModel getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeputyData)) {
                return false;
            }
            DeputyData deputyData = (DeputyData) other;
            return fr.t.c(this.picture, deputyData.picture) && fr.t.c(this.verificationDateTime, deputyData.verificationDateTime) && fr.t.c(this.data, deputyData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "DeputyData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$c;", "Lco3/s;", "", "picture", "verificationDateTime", "Lo34/c;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lo34/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lo34/c;", "b", "()Lo34/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DiiaData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final o34.c data;

        public DiiaData(String str, String str2, o34.c cVar) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = cVar;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o34.c getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DiiaData)) {
                return false;
            }
            DiiaData diiaData = (DiiaData) other;
            return fr.t.c(this.picture, diiaData.picture) && fr.t.c(this.verificationDateTime, diiaData.verificationDateTime) && fr.t.c(this.data, diiaData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "DiiaData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$d;", "Lco3/s;", "", "picture", "verificationDateTime", "Ljr0/d;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljr0/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Ljr0/d;", "b", "()Ljr0/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DrivingLicenceData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DrivingLicenceScope data;

        public DrivingLicenceData(String str, String str2, DrivingLicenceScope drivingLicenceScope) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = drivingLicenceScope;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DrivingLicenceScope getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrivingLicenceData)) {
                return false;
            }
            DrivingLicenceData drivingLicenceData = (DrivingLicenceData) other;
            return fr.t.c(this.picture, drivingLicenceData.picture) && fr.t.c(this.verificationDateTime, drivingLicenceData.verificationDateTime) && fr.t.c(this.data, drivingLicenceData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "DrivingLicenceData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$e;", "Lco3/s;", "", "picture", "verificationDateTime", "Ll34/b;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ll34/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Ll34/b;", "b", "()Ll34/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DynamicDocumentData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final DynamicDocumentVerification data;

        public DynamicDocumentData(String str, String str2, DynamicDocumentVerification dynamicDocumentVerification) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = dynamicDocumentVerification;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DynamicDocumentVerification getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DynamicDocumentData)) {
                return false;
            }
            DynamicDocumentData dynamicDocumentData = (DynamicDocumentData) other;
            return fr.t.c(this.picture, dynamicDocumentData.picture) && fr.t.c(this.verificationDateTime, dynamicDocumentData.verificationDateTime) && fr.t.c(this.data, dynamicDocumentData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "DynamicDocumentData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$f;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/r;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/r;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/r;", "b", "()Lk34/r;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyCardData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyDataModel data;

        public FamilyCardData(String str, String str2, FamilyDataModel familyDataModel) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = familyDataModel;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final FamilyDataModel getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FamilyCardData)) {
                return false;
            }
            FamilyCardData familyCardData = (FamilyCardData) other;
            return fr.t.c(this.picture, familyCardData.picture) && fr.t.c(this.verificationDateTime, familyCardData.verificationDateTime) && fr.t.c(this.data, familyCardData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "FamilyCardData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$g;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/v;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/v;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/v;", "b", "()Lk34/v;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSchoolData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final JuniorSchoolCardData data;

        public JuniorSchoolData(String str, String str2, JuniorSchoolCardData juniorSchoolCardData) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = juniorSchoolCardData;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final JuniorSchoolCardData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JuniorSchoolData)) {
                return false;
            }
            JuniorSchoolData juniorSchoolData = (JuniorSchoolData) other;
            return fr.t.c(this.picture, juniorSchoolData.picture) && fr.t.c(this.verificationDateTime, juniorSchoolData.verificationDateTime) && fr.t.c(this.data, juniorSchoolData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "JuniorSchoolData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$h, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$h;", "Lco3/s;", "", "picture", "verificationDateTime", "Ljr0/m;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljr0/m;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Ljr0/m;", "b", "()Ljr0/m;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MIdData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final PersonalDataScope8 data;

        public MIdData(String str, String str2, PersonalDataScope8 personalDataScope8) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = personalDataScope8;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PersonalDataScope8 getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MIdData)) {
                return false;
            }
            MIdData mIdData = (MIdData) other;
            return fr.t.c(this.picture, mIdData.picture) && fr.t.c(this.verificationDateTime, mIdData.verificationDateTime) && fr.t.c(this.data, mIdData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "MIdData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$i, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u001e"}, d2 = {"Lco3/s$i;", "Lco3/s;", "", "picture", "verificationDateTime", "Ljr0/j;", "data", "", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljr0/j;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Ljr0/j;", "b", "()Ljr0/j;", "f", "I", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NipipData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final NipipScope data;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final int scope;

        public NipipData(String str, String str2, NipipScope nipipScope, int i15) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = nipipScope;
            this.scope = i15;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NipipScope getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getScope() {
            return this.scope;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NipipData)) {
                return false;
            }
            NipipData nipipData = (NipipData) other;
            return fr.t.c(this.picture, nipipData.picture) && fr.t.c(this.verificationDateTime, nipipData.verificationDateTime) && fr.t.c(this.data, nipipData.data) && this.scope == nipipData.scope;
        }

        public int hashCode() {
            String str = this.picture;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode()) * 31) + Integer.hashCode(this.scope);
        }

        public String toString() {
            return "NipipData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ", scope=" + this.scope + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$j, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$j;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/x;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/x;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/x;", "b", "()Lk34/x;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PensionerData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final PensionerCardDocumentData data;

        public PensionerData(String str, String str2, PensionerCardDocumentData pensionerCardDocumentData) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = pensionerCardDocumentData;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final PensionerCardDocumentData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PensionerData)) {
                return false;
            }
            PensionerData pensionerData = (PensionerData) other;
            return fr.t.c(this.picture, pensionerData.picture) && fr.t.c(this.verificationDateTime, pensionerData.verificationDateTime) && fr.t.c(this.data, pensionerData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "PensionerData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$k, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$k;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/z;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/z;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/z;", "b", "()Lk34/z;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RailwayCardData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final RailwayCardDocumentData data;

        public RailwayCardData(String str, String str2, RailwayCardDocumentData railwayCardDocumentData) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = railwayCardDocumentData;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final RailwayCardDocumentData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RailwayCardData)) {
                return false;
            }
            RailwayCardData railwayCardData = (RailwayCardData) other;
            return fr.t.c(this.picture, railwayCardData.picture) && fr.t.c(this.verificationDateTime, railwayCardData.verificationDateTime) && fr.t.c(this.data, railwayCardData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "RailwayCardData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$l, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$l;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/c0;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/c0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/c0;", "b", "()Lk34/c0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StudentData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final StudentCardDocumentData data;

        public StudentData(String str, String str2, StudentCardDocumentData studentCardDocumentData) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = studentCardDocumentData;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final StudentCardDocumentData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StudentData)) {
                return false;
            }
            StudentData studentData = (StudentData) other;
            return fr.t.c(this.picture, studentData.picture) && fr.t.c(this.verificationDateTime, studentData.verificationDateTime) && fr.t.c(this.data, studentData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "StudentData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: co3.s$m, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lco3/s$m;", "Lco3/s;", "", "picture", "verificationDateTime", "Lk34/k0;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lk34/k0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "a", "d", "e", "Lk34/k0;", "b", "()Lk34/k0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WruData extends s {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String picture;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String verificationDateTime;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final WruDocumentData data;

        public WruData(String str, String str2, WruDocumentData wruDocumentData) {
            super(str, str2, null);
            this.picture = str;
            this.verificationDateTime = str2;
            this.data = wruDocumentData;
        }

        @Override // co3.s
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getPicture() {
            return this.picture;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final WruDocumentData getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVerificationDateTime() {
            return this.verificationDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WruData)) {
                return false;
            }
            WruData wruData = (WruData) other;
            return fr.t.c(this.picture, wruData.picture) && fr.t.c(this.verificationDateTime, wruData.verificationDateTime) && fr.t.c(this.data, wruData.data);
        }

        public int hashCode() {
            String str = this.picture;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.verificationDateTime.hashCode()) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "WruData(picture=" + this.picture + ", verificationDateTime=" + this.verificationDateTime + ", data=" + this.data + ')';
        }
    }

    public /* synthetic */ s(String str, String str2, fr.k kVar) {
        this(str, str2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getPicture() {
        return this.picture;
    }

    private s(String str, String str2) {
        this.picture = str;
        this.verificationDateTime = str2;
    }
}
