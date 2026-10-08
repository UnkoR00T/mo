package ru1;

import androidx.p016lifecycle.t0;
import f00.j0;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru1/a;", "Landroidx/lifecycle/t0;", "", "Lru1/a$a$a;", "setupData", "<init>", "(Lru1/a$a$a;)V", "b", "Lru1/a$a$a;", "Z8", "()Lru1/a$a$a;", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4493a.SetupData setupData;

    /* JADX INFO: renamed from: ru1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lru1/a$a;", "", "Lru1/a$a$a;", "Lru1/a;", "a", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC4493a extends j0 {

        /* JADX INFO: renamed from: ru1.a$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru1/a$a$a;", "", "", "fromTemporaryDrivingLicence", "Lgv3/b$b;", "screenData", "<init>", "(ZLgv3/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lgv3/b$b;", "()Lgv3/b$b;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SetupData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean fromTemporaryDrivingLicence;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final gv3.b.DocumentDownloadSetupData screenData;

            public SetupData(boolean z15, gv3.b.DocumentDownloadSetupData documentDownloadSetupData) {
                this.fromTemporaryDrivingLicence = z15;
                this.screenData = documentDownloadSetupData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getFromTemporaryDrivingLicence() {
                return this.fromTemporaryDrivingLicence;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final gv3.b.DocumentDownloadSetupData getScreenData() {
                return this.screenData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SetupData)) {
                    return false;
                }
                SetupData setupData = (SetupData) other;
                return this.fromTemporaryDrivingLicence == setupData.fromTemporaryDrivingLicence && t.c(this.screenData, setupData.screenData);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.fromTemporaryDrivingLicence) * 31) + this.screenData.hashCode();
            }

            public String toString() {
                return "SetupData(fromTemporaryDrivingLicence=" + this.fromTemporaryDrivingLicence + ", screenData=" + this.screenData + ')';
            }
        }
    }

    public a(InterfaceC4493a.SetupData setupData) {
        this.setupData = setupData;
    }

    /* JADX INFO: renamed from: Z8, reason: from getter */
    public final InterfaceC4493a.SetupData getSetupData() {
        return this.setupData;
    }
}
