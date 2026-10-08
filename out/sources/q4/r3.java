package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lq4/r3;", "", "", "capacity", "<init>", "(I)V", "Lq4/s3;", "key", "Lq4/t3;", "a", "(Lq4/s3;)Lq4/t3;", "value", "Loq/i0;", "b", "(Lq4/s3;Lq4/t3;)V", "Lr0/c0;", "Lq4/j;", "Lr0/c0;", "cache", "Lq4/j;", "singleSizeCacheInput", "c", "Lq4/t3;", "singleSizeCacheResult", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r0.c0<j, TextLayoutResult> cache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private j singleSizeCacheInput;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private TextLayoutResult singleSizeCacheResult;

    public r3(int i15) {
        this.cache = i15 != 1 ? new r0.c0<>(i15) : null;
    }

    public final TextLayoutResult a(TextLayoutInput key) {
        TextLayoutResult textLayoutResultD;
        j jVar = new j(key);
        r0.c0<j, TextLayoutResult> c0Var = this.cache;
        if (c0Var != null) {
            textLayoutResultD = c0Var.d(jVar);
        } else {
            if (!fr.t.c(this.singleSizeCacheInput, jVar)) {
                return null;
            }
            textLayoutResultD = this.singleSizeCacheResult;
        }
        if (textLayoutResultD == null || textLayoutResultD.getMultiParagraph().getIntrinsics().a()) {
            return null;
        }
        return textLayoutResultD;
    }

    public final void b(TextLayoutInput key, TextLayoutResult value) {
        r0.c0<j, TextLayoutResult> c0Var = this.cache;
        if (c0Var != null) {
            c0Var.e(new j(key), value);
        } else {
            this.singleSizeCacheInput = new j(key);
            this.singleSizeCacheResult = value;
        }
    }
}
