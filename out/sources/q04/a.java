package q04;

import iy.g;
import iy.p;
import p071kotlin.Metadata;
import px.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lq04/a;", "", "<init>", "()V", "Ln04/a;", "cloudStorageInteractor", "Lr04/c;", "getFileEncryptionAlgorithmUC", "Lr04/a;", "createFragmentedUrlUC", "Liy/g;", "cipherAes", "Liy/p;", "ivGenerator", "Lpy/a;", "aesKeyDecoder", "Liy/a;", "base64Coder", "Lyo0/b;", "uploadFileUC", "Lp04/b;", "b", "(Ln04/a;Lr04/c;Lr04/a;Liy/g;Liy/p;Lpy/a;Liy/a;Lyo0/b;)Lp04/b;", "Lyo0/a;", "downloadFileUC", "Lpx/d;", "remoteLogger", "Lp04/a;", "a", "(Ln04/a;Lr04/c;Lr04/a;Liy/g;Lpy/a;Liy/a;Lyo0/a;Lpx/d;)Lp04/a;", "cloudstorage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final p04.a a(n04.a cloudStorageInteractor, r04.c getFileEncryptionAlgorithmUC, r04.a createFragmentedUrlUC, g cipherAes, py.a aesKeyDecoder, iy.a base64Coder, yo0.a downloadFileUC, d remoteLogger) {
        return new r04.b(cloudStorageInteractor, getFileEncryptionAlgorithmUC, createFragmentedUrlUC, cipherAes, aesKeyDecoder, base64Coder, downloadFileUC, remoteLogger);
    }

    public final p04.b b(n04.a cloudStorageInteractor, r04.c getFileEncryptionAlgorithmUC, r04.a createFragmentedUrlUC, g cipherAes, p ivGenerator, py.a aesKeyDecoder, iy.a base64Coder, yo0.b uploadFileUC) {
        return new r04.d(cloudStorageInteractor, getFileEncryptionAlgorithmUC, createFragmentedUrlUC, cipherAes, ivGenerator, aesKeyDecoder, base64Coder, uploadFileUC);
    }
}
