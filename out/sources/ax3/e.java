package ax3;

import android.graphics.Bitmap;
import cw3.IdentityPhotoData;
import java.util.Collection;
import java.util.Set;
import jw3.MaskDefinition;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lax3/e;", "", "a", "c", "b", "Lax3/e$a;", "Lax3/e$b;", "Lax3/e$c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lax3/e$a;", "Lax3/e;", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lax3/e$b$b;", "Lax3/e$c$a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends e {
        /* JADX INFO: renamed from: a */
        hb4.c getVmsAdapter();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lax3/e$c;", "Lax3/e;", "Lax3/d;", "getData", "()Lax3/d;", "data", "b", "c", "a", "Lax3/e$c$a;", "Lax3/e$c$b;", "Lax3/e$c$c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends e {

        /* JADX INFO: renamed from: ax3.e$c$a, reason: from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"Lax3/e$c$a;", "Lax3/e$c;", "Lax3/e$a;", "Lax3/d;", "data", "Lhb4/c;", "vmsAdapter", "<init>", "(Lax3/d;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/d;", "getData", "()Lax3/d;", "b", "Lhb4/c;", "()Lhb4/c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements c, a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SetupData data;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(SetupData setupData, hb4.c cVar) {
                this.data = setupData;
                this.vmsAdapter = cVar;
            }

            @Override // ax3.e.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.data, error.data) && fr.t.c(this.vmsAdapter, error.vmsAdapter);
            }

            @Override // ax3.e.c
            public SetupData getData() {
                return this.data;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(data=" + this.data + ", vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.e$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lax3/e$c$b;", "Lax3/e$c;", "Lax3/d;", "data", "<init>", "(Lax3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/d;", "getData", "()Lax3/d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SetupData data;

            public Loading(SetupData setupData) {
                this.data = setupData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && fr.t.c(this.data, ((Loading) other).data);
            }

            @Override // ax3.e.c
            public SetupData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "Loading(data=" + this.data + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.e$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lax3/e$c$c;", "Lax3/e$c;", "Lax3/d;", "data", "<init>", "(Lax3/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/d;", "getData", "()Lax3/d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProcessingPhoto implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final SetupData data;

            public ProcessingPhoto(SetupData setupData) {
                this.data = setupData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProcessingPhoto) && fr.t.c(this.data, ((ProcessingPhoto) other).data);
            }

            @Override // ax3.e.c
            public SetupData getData() {
                return this.data;
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "ProcessingPhoto(data=" + this.data + ')';
            }
        }

        SetupData getData();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\n\u0007\f\r\u0003\u000eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lax3/e$b;", "Lax3/e;", "Lax3/e$b$d;", "b", "()Lax3/e$b$d;", "stateData", "", "d", "()Z", "isPhotoValid", "c", "canSavePhoto", "e", "f", "a", "Lax3/e$b$a;", "Lax3/e$b$b;", "Lax3/e$b$e;", "Lax3/e$b$f;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends e {

        /* JADX INFO: renamed from: ax3.e$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lax3/e$b$a;", "Lax3/e$b;", "Lcb4/i;", "dialogAdapter", "Lax3/e$b$d;", "stateData", "<init>", "(Lcb4/i;Lax3/e$b$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "e", "()Lcb4/i;", "b", "Lax3/e$b$d;", "()Lax3/e$b$d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Dialog implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData stateData;

            public Dialog(cb4.i iVar, InitializedStateData initializedStateData) {
                this.dialogAdapter = iVar;
                this.stateData = initializedStateData;
            }

            @Override // ax3.e.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public InitializedStateData getStateData() {
                return this.stateData;
            }

            @Override // ax3.e.b
            public /* bridge */ boolean c() {
                return super.c();
            }

            @Override // ax3.e.b
            public /* bridge */ boolean d() {
                return super.d();
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final cb4.i getDialogAdapter() {
                return this.dialogAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Dialog)) {
                    return false;
                }
                Dialog dialog = (Dialog) other;
                return fr.t.c(this.dialogAdapter, dialog.dialogAdapter) && fr.t.c(this.stateData, dialog.stateData);
            }

            public int hashCode() {
                return (this.dialogAdapter.hashCode() * 31) + this.stateData.hashCode();
            }

            public String toString() {
                return "Dialog(dialogAdapter=" + this.dialogAdapter + ", stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.e$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lax3/e$b$b;", "Lax3/e$b;", "Lax3/e$a;", "Lax3/e$b$d;", "stateData", "Lhb4/c;", "vmsAdapter", "<init>", "(Lax3/e$b$d;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/e$b$d;", "b", "()Lax3/e$b$d;", "Lhb4/c;", "()Lhb4/c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b, a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData stateData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c vmsAdapter;

            public Error(InitializedStateData initializedStateData, hb4.c cVar) {
                this.stateData = initializedStateData;
                this.vmsAdapter = cVar;
            }

            @Override // ax3.e.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public hb4.c getVmsAdapter() {
                return this.vmsAdapter;
            }

            @Override // ax3.e.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public InitializedStateData getStateData() {
                return this.stateData;
            }

            @Override // ax3.e.b
            public /* bridge */ boolean c() {
                return super.c();
            }

            @Override // ax3.e.b
            public /* bridge */ boolean d() {
                return super.d();
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.stateData, error.stateData) && fr.t.c(this.vmsAdapter, error.vmsAdapter);
            }

            public int hashCode() {
                return (this.stateData.hashCode() * 31) + this.vmsAdapter.hashCode();
            }

            public String toString() {
                return "Error(stateData=" + this.stateData + ", vmsAdapter=" + this.vmsAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.e$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001d"}, d2 = {"Lax3/e$b$c;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lwx/i$a;", "image", "", "originalWidth", "originalHeight", "<init>", "(Landroid/graphics/Bitmap;Lwx/i$a;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Lwx/i$a;", "()Lwx/i$a;", "c", "I", "d", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ImageData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap bitmap;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final wx.i.Image image;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int originalWidth;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final int originalHeight;

            public ImageData(Bitmap bitmap, wx.i.Image image, int i15, int i16) {
                this.bitmap = bitmap;
                this.image = image;
                this.originalWidth = i15;
                this.originalHeight = i16;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Bitmap getBitmap() {
                return this.bitmap;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final wx.i.Image getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getOriginalHeight() {
                return this.originalHeight;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final int getOriginalWidth() {
                return this.originalWidth;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageData)) {
                    return false;
                }
                ImageData imageData = (ImageData) other;
                return fr.t.c(this.bitmap, imageData.bitmap) && fr.t.c(this.image, imageData.image) && this.originalWidth == imageData.originalWidth && this.originalHeight == imageData.originalHeight;
            }

            public int hashCode() {
                return (((((this.bitmap.hashCode() * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.originalWidth)) * 31) + Integer.hashCode(this.originalHeight);
            }

            public String toString() {
                return "ImageData(bitmap=" + this.bitmap + ", image=" + this.image + ", originalWidth=" + this.originalWidth + ", originalHeight=" + this.originalHeight + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.e$b$e, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lax3/e$b$e;", "Lax3/e$b;", "Lax3/e$b$d;", "stateData", "<init>", "(Lax3/e$b$d;)V", "e", "(Lax3/e$b$d;)Lax3/e$b$e;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/e$b$d;", "b", "()Lax3/e$b$d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PhotoLoaded implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData stateData;

            public PhotoLoaded(InitializedStateData initializedStateData) {
                this.stateData = initializedStateData;
            }

            @Override // ax3.e.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public InitializedStateData getStateData() {
                return this.stateData;
            }

            @Override // ax3.e.b
            public /* bridge */ boolean c() {
                return super.c();
            }

            @Override // ax3.e.b
            public /* bridge */ boolean d() {
                return super.d();
            }

            public final PhotoLoaded e(InitializedStateData stateData) {
                return new PhotoLoaded(stateData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PhotoLoaded) && fr.t.c(this.stateData, ((PhotoLoaded) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "PhotoLoaded(stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: ax3.e$b$f, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lax3/e$b$f;", "Lax3/e$b;", "Lax3/e$b$d;", "stateData", "<init>", "(Lax3/e$b$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lax3/e$b$d;", "b", "()Lax3/e$b$d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProcessingPhoto implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InitializedStateData stateData;

            public ProcessingPhoto(InitializedStateData initializedStateData) {
                this.stateData = initializedStateData;
            }

            @Override // ax3.e.b
            /* JADX INFO: renamed from: b, reason: from getter */
            public InitializedStateData getStateData() {
                return this.stateData;
            }

            @Override // ax3.e.b
            public /* bridge */ boolean c() {
                return super.c();
            }

            @Override // ax3.e.b
            public /* bridge */ boolean d() {
                return super.d();
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProcessingPhoto) && fr.t.c(this.stateData, ((ProcessingPhoto) other).stateData);
            }

            public int hashCode() {
                return this.stateData.hashCode();
            }

            public String toString() {
                return "ProcessingPhoto(stateData=" + this.stateData + ')';
            }
        }

        /* JADX INFO: renamed from: b */
        InitializedStateData getStateData();

        default boolean c() {
            Set<IdentityPhotoData.c> setA;
            jw3.a faceValidationState = getStateData().getFaceValidationState();
            jw3.a.Invalid c2529a = faceValidationState instanceof jw3.a.Invalid ? (jw3.a.Invalid) faceValidationState : null;
            if (c2529a != null && (setA = c2529a.a()) != null) {
                Set<IdentityPhotoData.c> set = setA;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (IdentityPhotoData.c cVar : set) {
                    if (cVar == IdentityPhotoData.c.DETECT_FACE || cVar == IdentityPhotoData.c.SINGLE_PERSON) {
                        return false;
                    }
                }
            }
            return true;
        }

        default boolean d() {
            return getStateData().getFaceValidationState() instanceof jw3.a.b;
        }

        /* JADX INFO: renamed from: ax3.e$b$d, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014Jj\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b+\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b%\u00104\u001a\u0004\b'\u00105R\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b6\u0010*R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109¨\u0006:"}, d2 = {"Lax3/e$b$d;", "", "Lcw3/a$b;", "requirements", "Lcw3/a$a;", "maskType", "", "isUnderGuardianship", "Lax3/e$b$c;", "imageData", "Ljw3/b;", "maskDefinition", "Ljw3/a;", "faceValidationState", "Lg30/v;", "bottomSheetValue", "isAdjustmentEnabled", "Ljw3/c;", "scaleType", "<init>", "(Lcw3/a$b;Lcw3/a$a;ZLax3/e$b$c;Ljw3/b;Ljw3/a;Lg30/v;ZLjw3/c;)V", "a", "(Lcw3/a$b;Lcw3/a$a;ZLax3/e$b$c;Ljw3/b;Ljw3/a;Lg30/v;ZLjw3/c;)Lax3/e$b$d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcw3/a$b;", "h", "()Lcw3/a$b;", "b", "Lcw3/a$a;", "g", "()Lcw3/a$a;", "c", "Z", "k", "()Z", "d", "Lax3/e$b$c;", "e", "()Lax3/e$b$c;", "Ljw3/b;", "f", "()Ljw3/b;", "Ljw3/a;", "()Ljw3/a;", "Lg30/v;", "()Lg30/v;", "j", "i", "Ljw3/c;", "()Ljw3/c;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InitializedStateData {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final IdentityPhotoData.PhotoRequirements requirements;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IdentityPhotoData.AbstractC0815a maskType;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isUnderGuardianship;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ImageData imageData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final MaskDefinition maskDefinition;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final jw3.a faceValidationState;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final g30.v bottomSheetValue;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isAdjustmentEnabled;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final jw3.c scaleType;

            public InitializedStateData(IdentityPhotoData.PhotoRequirements photoRequirements, IdentityPhotoData.AbstractC0815a abstractC0815a, boolean z15, ImageData imageData, MaskDefinition bVar, jw3.a aVar, g30.v vVar, boolean z16, jw3.c cVar) {
                this.requirements = photoRequirements;
                this.maskType = abstractC0815a;
                this.isUnderGuardianship = z15;
                this.imageData = imageData;
                this.maskDefinition = bVar;
                this.faceValidationState = aVar;
                this.bottomSheetValue = vVar;
                this.isAdjustmentEnabled = z16;
                this.scaleType = cVar;
            }

            public static /* synthetic */ InitializedStateData b(InitializedStateData initializedStateData, IdentityPhotoData.PhotoRequirements photoRequirements, IdentityPhotoData.AbstractC0815a abstractC0815a, boolean z15, ImageData imageData, MaskDefinition bVar, jw3.a aVar, g30.v vVar, boolean z16, jw3.c cVar, int i15, Object obj) {
                if ((i15 & 1) != 0) {
                    photoRequirements = initializedStateData.requirements;
                }
                if ((i15 & 2) != 0) {
                    abstractC0815a = initializedStateData.maskType;
                }
                if ((i15 & 4) != 0) {
                    z15 = initializedStateData.isUnderGuardianship;
                }
                if ((i15 & 8) != 0) {
                    imageData = initializedStateData.imageData;
                }
                if ((i15 & 16) != 0) {
                    bVar = initializedStateData.maskDefinition;
                }
                if ((i15 & 32) != 0) {
                    aVar = initializedStateData.faceValidationState;
                }
                if ((i15 & 64) != 0) {
                    vVar = initializedStateData.bottomSheetValue;
                }
                if ((i15 & 128) != 0) {
                    z16 = initializedStateData.isAdjustmentEnabled;
                }
                if ((i15 & 256) != 0) {
                    cVar = initializedStateData.scaleType;
                }
                boolean z17 = z16;
                jw3.c cVar2 = cVar;
                jw3.a aVar2 = aVar;
                g30.v vVar2 = vVar;
                MaskDefinition bVar2 = bVar;
                boolean z18 = z15;
                return initializedStateData.a(photoRequirements, abstractC0815a, z18, imageData, bVar2, aVar2, vVar2, z17, cVar2);
            }

            public final InitializedStateData a(IdentityPhotoData.PhotoRequirements requirements, IdentityPhotoData.AbstractC0815a maskType, boolean isUnderGuardianship, ImageData imageData, MaskDefinition maskDefinition, jw3.a faceValidationState, g30.v bottomSheetValue, boolean isAdjustmentEnabled, jw3.c scaleType) {
                return new InitializedStateData(requirements, maskType, isUnderGuardianship, imageData, maskDefinition, faceValidationState, bottomSheetValue, isAdjustmentEnabled, scaleType);
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final g30.v getBottomSheetValue() {
                return this.bottomSheetValue;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final jw3.a getFaceValidationState() {
                return this.faceValidationState;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ImageData getImageData() {
                return this.imageData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InitializedStateData)) {
                    return false;
                }
                InitializedStateData initializedStateData = (InitializedStateData) other;
                return fr.t.c(this.requirements, initializedStateData.requirements) && fr.t.c(this.maskType, initializedStateData.maskType) && this.isUnderGuardianship == initializedStateData.isUnderGuardianship && fr.t.c(this.imageData, initializedStateData.imageData) && fr.t.c(this.maskDefinition, initializedStateData.maskDefinition) && fr.t.c(this.faceValidationState, initializedStateData.faceValidationState) && this.bottomSheetValue == initializedStateData.bottomSheetValue && this.isAdjustmentEnabled == initializedStateData.isAdjustmentEnabled && this.scaleType == initializedStateData.scaleType;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final MaskDefinition getMaskDefinition() {
                return this.maskDefinition;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final IdentityPhotoData.AbstractC0815a getMaskType() {
                return this.maskType;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final IdentityPhotoData.PhotoRequirements getRequirements() {
                return this.requirements;
            }

            public int hashCode() {
                return (((((((((((((((this.requirements.hashCode() * 31) + this.maskType.hashCode()) * 31) + Boolean.hashCode(this.isUnderGuardianship)) * 31) + this.imageData.hashCode()) * 31) + this.maskDefinition.hashCode()) * 31) + this.faceValidationState.hashCode()) * 31) + this.bottomSheetValue.hashCode()) * 31) + Boolean.hashCode(this.isAdjustmentEnabled)) * 31) + this.scaleType.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final jw3.c getScaleType() {
                return this.scaleType;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getIsAdjustmentEnabled() {
                return this.isAdjustmentEnabled;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getIsUnderGuardianship() {
                return this.isUnderGuardianship;
            }

            public String toString() {
                return "InitializedStateData(requirements=" + this.requirements + ", maskType=" + this.maskType + ", isUnderGuardianship=" + this.isUnderGuardianship + ", imageData=" + this.imageData + ", maskDefinition=" + this.maskDefinition + ", faceValidationState=" + this.faceValidationState + ", bottomSheetValue=" + this.bottomSheetValue + ", isAdjustmentEnabled=" + this.isAdjustmentEnabled + ", scaleType=" + this.scaleType + ')';
            }

            public /* synthetic */ InitializedStateData(IdentityPhotoData.PhotoRequirements photoRequirements, IdentityPhotoData.AbstractC0815a abstractC0815a, boolean z15, ImageData imageData, MaskDefinition bVar, jw3.a aVar, g30.v vVar, boolean z16, jw3.c cVar, int i15, fr.k kVar) {
                this(photoRequirements, abstractC0815a, z15, imageData, bVar, aVar, (i15 & 64) != 0 ? g30.v.HIDDEN : vVar, z16, cVar);
            }
        }
    }
}
