package tmsdkobf;

import java.util.ArrayList;

/* compiled from: Unknown */
public final class av extends fs {
    static ArrayList<ay> bM;
    public int bC;
    public ArrayList<ay> bL;
    public String imsi;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: tmsdkobf.av.<clinit>():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:113)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:256)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
Caused by: jadx.core.utils.exceptions.DecodeException:  in method: tmsdkobf.av.<clinit>():void
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:46)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:98)
	... 5 more
Caused by: java.lang.IllegalArgumentException: bogus opcode: 00e9
	at com.android.dx.io.OpcodeInfo.get(OpcodeInfo.java:1197)
	at com.android.dx.io.OpcodeInfo.getFormat(OpcodeInfo.java:1212)
	at com.android.dx.io.instructions.DecodedInstruction.decode(DecodedInstruction.java:72)
	at jadx.core.dex.instructions.InsnDecoder.decodeInsns(InsnDecoder.java:43)
	... 6 more
*/
        /*
        // Can't load method instructions.
        */
        throw new UnsupportedOperationException("Method not decompiled: tmsdkobf.av.<clinit>():void");
    }

    public av() {
        this.bL = null;
        this.imsi = "";
        this.bC = 0;
    }

    public fs newInit() {
        return new av();
    }

    public void readFrom(fq fqVar) {
        this.bL = (ArrayList) fqVar.b(bM, 0, true);
        this.imsi = fqVar.a(1, false);
        this.bC = fqVar.a(this.bC, 2, false);
    }

    public void writeTo(fr frVar) {
        frVar.a(this.bL, 0);
        if (this.imsi != null) {
            frVar.a(this.imsi, 1);
        }
        if (this.bC != 0) {
            frVar.write(this.bC, 2);
        }
    }
}
