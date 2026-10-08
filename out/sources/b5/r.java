package b5;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb5/q;", "start", "stop", "", "fraction", "a", "(Lb5/q;Lb5/q;F)Lb5/q;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final TextGeometricTransform a(TextGeometricTransform textGeometricTransform, TextGeometricTransform textGeometricTransform2, float f15) {
        return new TextGeometricTransform(e5.c.b(textGeometricTransform.getScaleX(), textGeometricTransform2.getScaleX(), f15), e5.c.b(textGeometricTransform.getSkewX(), textGeometricTransform2.getSkewX(), f15));
    }
}
