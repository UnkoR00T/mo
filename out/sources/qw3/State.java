package qw3;

import android.graphics.Matrix;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qw3.i, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lqw3/i;", "", "Landroid/graphics/Matrix;", "matrix", "", "sliderDegreesValue", "Lqw3/f;", "imageData", "<init>", "(Landroid/graphics/Matrix;ILqw3/f;)V", "a", "(Landroid/graphics/Matrix;ILqw3/f;)Lqw3/i;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/graphics/Matrix;", "d", "()Landroid/graphics/Matrix;", "b", "I", "e", "c", "Lqw3/f;", "()Lqw3/f;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Matrix matrix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sliderDegreesValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ImageData imageData;

    public State(Matrix matrix, int i15, ImageData imageData) {
        this.matrix = matrix;
        this.sliderDegreesValue = i15;
        this.imageData = imageData;
    }

    public static /* synthetic */ State b(State state, Matrix matrix, int i15, ImageData imageData, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            matrix = state.matrix;
        }
        if ((i16 & 2) != 0) {
            i15 = state.sliderDegreesValue;
        }
        if ((i16 & 4) != 0) {
            imageData = state.imageData;
        }
        return state.a(matrix, i15, imageData);
    }

    public final State a(Matrix matrix, int sliderDegreesValue, ImageData imageData) {
        return new State(matrix, sliderDegreesValue, imageData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ImageData getImageData() {
        return this.imageData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getSliderDegreesValue() {
        return this.sliderDegreesValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.matrix, state.matrix) && this.sliderDegreesValue == state.sliderDegreesValue && t.c(this.imageData, state.imageData);
    }

    public int hashCode() {
        return (((this.matrix.hashCode() * 31) + Integer.hashCode(this.sliderDegreesValue)) * 31) + this.imageData.hashCode();
    }

    public String toString() {
        return "State(matrix=" + this.matrix + ", sliderDegreesValue=" + this.sliderDegreesValue + ", imageData=" + this.imageData + ')';
    }
}
