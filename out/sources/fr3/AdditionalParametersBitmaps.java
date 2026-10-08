package fr3;

import android.graphics.Bitmap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fr3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfr3/b;", "", "", "", "Landroid/graphics/Bitmap;", "qrCodeBitmaps", "barcodeBitmaps", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalParametersBitmaps {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Bitmap> qrCodeBitmaps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Bitmap> barcodeBitmaps;

    public AdditionalParametersBitmaps(Map<String, Bitmap> map, Map<String, Bitmap> map2) {
        this.qrCodeBitmaps = map;
        this.barcodeBitmaps = map2;
    }

    public final Map<String, Bitmap> a() {
        return this.barcodeBitmaps;
    }

    public final Map<String, Bitmap> b() {
        return this.qrCodeBitmaps;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalParametersBitmaps)) {
            return false;
        }
        AdditionalParametersBitmaps additionalParametersBitmaps = (AdditionalParametersBitmaps) other;
        return fr.t.c(this.qrCodeBitmaps, additionalParametersBitmaps.qrCodeBitmaps) && fr.t.c(this.barcodeBitmaps, additionalParametersBitmaps.barcodeBitmaps);
    }

    public int hashCode() {
        return (this.qrCodeBitmaps.hashCode() * 31) + this.barcodeBitmaps.hashCode();
    }

    public String toString() {
        return "AdditionalParametersBitmaps(qrCodeBitmaps=" + this.qrCodeBitmaps + ", barcodeBitmaps=" + this.barcodeBitmaps + ')';
    }
}
