function hmirrorshaded( context )
{
	this.init( context );
}

hmirrorshaded.prototype =
{
	name: "Horizontal Shaded Mirror",
	
	context: null,
	
	leftBrush: null,
	rightBrush: null,

	init: function( context )
	{
		this.context = context;
		this.leftBrush = new shaded(context);
		this.rightBrush = new shaded(context);
	},

	destroy: function()
	{
		this.leftBrush.destroy();
		this.leftBrush = null;
		this.rightBrush.destroy();
		this.rightBrush = null;
	},

	strokeStart: function( mouseX, mouseY )
	{
		this.leftBrush.strokeStart(mouseX, mouseY);
		this.rightBrush.strokeStart(this.context.canvas.width - mouseX, mouseY)
		
	},

	stroke: function( mouseX, mouseY )
	{
		this.leftBrush.stroke(mouseX, mouseY);
		this.rightBrush.stroke(this.context.canvas.width - mouseX, mouseY);
	},

	strokeEnd: function()
	{
		this.leftBrush.strokeEnd();
		this.rightBrush.strokeEnd();
	}
}

function vmirrorshaded( context )
{
	this.init( context );
}

vmirrorshaded.prototype =
{
	name: "Vertical Shaded Mirror",
	
	context: null,
	
	topBrush: null,
	bottomBrush: null,

	init: function( context )
	{
		this.context = context;
		this.topBrush = new shaded(context);
		this.bottomBrush = new shaded(context);
	},

	destroy: function()
	{
		this.topBrush.destroy();
		this.topBrush = null;
		this.bottomBrush.destroy();
		this.bottomBrush = null;
	},

	strokeStart: function( mouseX, mouseY )
	{
		this.topBrush.strokeStart(mouseX, mouseY);
		this.bottomBrush.strokeStart(mouseX, this.context.canvas.height - mouseY)
		
	},

	stroke: function( mouseX, mouseY )
	{
		this.topBrush.stroke(mouseX, mouseY);
		this.bottomBrush.stroke(mouseX, this.context.canvas.height - mouseY);
	},

	strokeEnd: function()
	{
		this.topBrush.strokeEnd();
		this.bottomBrush.strokeEnd();
	}
}

