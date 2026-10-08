package lw3;

import android.graphics.Bitmap;
import cw3.IdentityPhotoData;
import jw3.MaskDefinition;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Llw3/c;", "", "b", "a", "Llw3/c$a;", "Llw3/c$b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: lw3.c$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llw3/c$b;", "Llw3/c;", "Lcw3/a$a;", "maskType", "<init>", "(Lcw3/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcw3/a$a;", "()Lcw3/a$a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Measuring implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdentityPhotoData.AbstractC0815a maskType;

        public Measuring(IdentityPhotoData.AbstractC0815a abstractC0815a) {
            this.maskType = abstractC0815a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final IdentityPhotoData.AbstractC0815a getMaskType() {
            return this.maskType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Measuring) && fr.t.c(this.maskType, ((Measuring) other).maskType);
        }

        public int hashCode() {
            return this.maskType.hashCode();
        }

        public String toString() {
            return "Measuring(maskType=" + this.maskType + ')';
        }
    }

    /* JADX INFO: renamed from: lw3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Llw3/c$a;", "Llw3/c;", "Landroid/graphics/Bitmap;", "photo", "Ljw3/b;", "maskDefinition", "Llw3/c$a$a;", "photoState", "<init>", "(Landroid/graphics/Bitmap;Ljw3/b;Llw3/c$a$a;)V", "a", "(Landroid/graphics/Bitmap;Ljw3/b;Llw3/c$a$a;)Llw3/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "b", "Ljw3/b;", "c", "()Ljw3/b;", "Llw3/c$a$a;", "e", "()Llw3/c$a$a;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap photo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final MaskDefinition maskDefinition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC2953a photoState;

        /* JADX INFO: renamed from: lw3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Llw3/c$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC2953a {
            INITIAL,
            MODIFYING,
            MODIFIED;


            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ wq.a f120882e = wq.b.a(b());
        }

        public Initialized(Bitmap bitmap, MaskDefinition maskDefinition, EnumC2953a enumC2953a) {
            this.photo = bitmap;
            this.maskDefinition = maskDefinition;
            this.photoState = enumC2953a;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, Bitmap bitmap, MaskDefinition maskDefinition, EnumC2953a enumC2953a, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bitmap = initialized.photo;
            }
            if ((i15 & 2) != 0) {
                maskDefinition = initialized.maskDefinition;
            }
            if ((i15 & 4) != 0) {
                enumC2953a = initialized.photoState;
            }
            return initialized.a(bitmap, maskDefinition, enumC2953a);
        }

        public final Initialized a(Bitmap photo, MaskDefinition maskDefinition, EnumC2953a photoState) {
            return new Initialized(photo, maskDefinition, photoState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final MaskDefinition getMaskDefinition() {
            return this.maskDefinition;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Bitmap getPhoto() {
            return this.photo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC2953a getPhotoState() {
            return this.photoState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.photo, initialized.photo) && fr.t.c(this.maskDefinition, initialized.maskDefinition) && this.photoState == initialized.photoState;
        }

        public int hashCode() {
            return (((this.photo.hashCode() * 31) + this.maskDefinition.hashCode()) * 31) + this.photoState.hashCode();
        }

        public String toString() {
            return "Initialized(photo=" + this.photo + ", maskDefinition=" + this.maskDefinition + ", photoState=" + this.photoState + ')';
        }

        public /* synthetic */ Initialized(Bitmap bitmap, MaskDefinition maskDefinition, EnumC2953a enumC2953a, int i15, fr.k kVar) {
            this(bitmap, maskDefinition, (i15 & 4) != 0 ? EnumC2953a.INITIAL : enumC2953a);
        }
    }
}
