package ar;

import java.io.ByteArrayOutputStream;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lar/c;", "Ljava/io/ByteArrayOutputStream;", "", "size", "<init>", "(I)V", "", "b", "()[B", "buffer", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class c extends ByteArrayOutputStream {
    public c(int i15) {
        super(i15);
    }

    public final byte[] b() {
        return ((ByteArrayOutputStream) this).buf;
    }
}
