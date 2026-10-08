package io.sentry.android.replay.util;

import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lio/sentry/android/replay/util/a;", "Lio/sentry/android/replay/util/n;", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "line", "offset", "", "f", "(II)F", "i", "(I)I", "h", "a", "e", "b", "Landroid/text/Layout;", "c", "()I", "lineCount", "g", "()Ljava/lang/Integer;", "dominantTextColor", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Layout layout;

    public a(Layout layout) {
        this.layout = layout;
    }

    @Override // io.sentry.android.replay.util.n
    public int a(int line) {
        return this.layout.getLineTop(line);
    }

    @Override // io.sentry.android.replay.util.n
    public int b(int line) {
        return this.layout.getLineStart(line);
    }

    @Override // io.sentry.android.replay.util.n
    public int c() {
        return this.layout.getLineCount();
    }

    @Override // io.sentry.android.replay.util.n
    public int e(int line) {
        return this.layout.getLineBottom(line);
    }

    @Override // io.sentry.android.replay.util.n
    public float f(int line, int offset) {
        return this.layout.getPrimaryHorizontal(offset);
    }

    @Override // io.sentry.android.replay.util.n
    public Integer g() {
        int i15;
        if (!(this.layout.getText() instanceof Spanned)) {
            return null;
        }
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) this.layout.getText()).getSpans(0, this.layout.getText().length(), ForegroundColorSpan.class);
        int i16 = PKIFailureInfo.systemUnavail;
        Integer numValueOf = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            int spanStart = ((Spanned) this.layout.getText()).getSpanStart(foregroundColorSpan);
            int spanEnd = ((Spanned) this.layout.getText()).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i15 = spanEnd - spanStart) > i16) {
                numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i16 = i15;
            }
        }
        if (numValueOf != null) {
            return Integer.valueOf(o.j(numValueOf.intValue()));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.n
    public int h(int line) {
        return this.layout.getLineVisibleEnd(line);
    }

    @Override // io.sentry.android.replay.util.n
    public int i(int line) {
        return this.layout.getEllipsisCount(line);
    }
}
