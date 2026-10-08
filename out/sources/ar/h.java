package ar;

import fu.r;
import java.io.File;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "", "j", "(Ljava/io/File;)Ljava/lang/String;", "extension", "k", "nameWithoutExtension", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class h extends g {
    public static String j(File file) {
        return r.h1(file.getName(), '.', "");
    }

    public static String k(File file) {
        return r.s1(file.getName(), ".", null, 2, null);
    }
}
